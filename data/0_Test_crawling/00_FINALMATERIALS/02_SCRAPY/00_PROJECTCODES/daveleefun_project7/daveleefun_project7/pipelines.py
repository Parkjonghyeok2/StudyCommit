# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://docs.scrapy.org/en/latest/topics/item-pipeline.html


# useful for handling different item types with a single interface
from itemadapter import ItemAdapter


class LinkCompletionPipeline:
    def process_item(self, item, spider):
        base_url = "https://davelee-fun.github.io"
        if 'link' in item:
            item['link'] = base_url + item['link']
        else:
            item['link'] = ''
        return item

class CleanTitlePipeline:
    def process_item(self, item, spider):
        if item['category'] is None:
            item['category'] = ''
        else:
            item['category'] = item['category'].replace(" 관련 상품 추천", "").strip()
            
        if item['title'] is None:
            item['title'] = ''
        else:
            item['title'] = item['title'].replace("상품명: ", "").strip()
            
        if item['name'] is None:
            item['name'] = ''
        else:
            item['name'] = item['name'].strip()
            
        if item['date'] is None:
            item['date'] = ''
        else:
            item['date'] = item['date'].strip()
        
        return item