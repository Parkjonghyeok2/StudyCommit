import scrapy
from daveleefun_project3.items import DaveleefunProject3Item

class CategorySpiderSpider(scrapy.Spider):
    name = "category_spider"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io"]

    def parse(self, response):
        categories = response.css('a.text-dark::text').getall()
        for category in categories:
            item = DaveleefunProject3Item()
            item['category'] = category
            yield item
       
