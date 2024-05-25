import scrapy
from daveleefun_project1.items import DaveleefunProject1Item

class DaveleefunSpider(scrapy.Spider):
    name = "daveleefun"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io"]

    def parse(self, response):
        item = DaveleefunProject1Item()
        item['title'] = response.css('h1.sitetitle::text').get()
        description = response.xpath('//p[@class="lead"]/text()').get()
        item['description'] = description.strip()
        yield item 
