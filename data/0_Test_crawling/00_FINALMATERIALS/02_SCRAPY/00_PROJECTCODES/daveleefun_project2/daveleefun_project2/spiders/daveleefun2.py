import scrapy
from daveleefun_project2.items import DaveleefunProject2Item

class Daveleefun2Spider(scrapy.Spider):
    name = "daveleefun2"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io"]

    def parse(self, response):
        item = DaveleefunProject2Item()
        item['title'] = response.css('h1.sitetitle::text').get()
        item['description'] = response.xpath('//p[@class="lead"]/text()').get()
        yield item
