import scrapy


class SeleniumTest2Spider(scrapy.Spider):
    name = "selenium_test2"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io/blog/TEST/index.html"]

    def parse(self, response):
        pass
