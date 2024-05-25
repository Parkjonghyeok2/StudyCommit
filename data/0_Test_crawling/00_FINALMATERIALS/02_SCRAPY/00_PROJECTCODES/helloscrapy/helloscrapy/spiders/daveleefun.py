import scrapy


class DaveleefunSpider(scrapy.Spider):
    name = "daveleefun"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io"]

    def parse(self, response):
        
        title = response.css('h1.sitetitle::text').get()
        description = response.xpath('//p[@class="lead"]/text()').get()
        yield {
            'title': title,
            'description': description.strip()
        }
