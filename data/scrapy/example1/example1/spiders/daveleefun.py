import scrapy

# 
class DaveleefunSpider(scrapy.Spider):
    name = "daveleefun"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["http://davelee-fun.github.io/"]

    def parse(self, response):
        pass
