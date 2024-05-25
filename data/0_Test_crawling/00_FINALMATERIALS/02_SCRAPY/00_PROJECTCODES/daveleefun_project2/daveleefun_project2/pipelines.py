# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://docs.scrapy.org/en/latest/topics/item-pipeline.html


# useful for handling different item types with a single interface
from itemadapter import ItemAdapter
from scrapy.exceptions import DropItem

class DaveleefunProject2Pipeline:
    def process_item(self, item, spider):
        if item['description']:
            item['description'] = item['description'].strip()
            return item
        else:
            raise DropItem("Missing description in %s" % item)
