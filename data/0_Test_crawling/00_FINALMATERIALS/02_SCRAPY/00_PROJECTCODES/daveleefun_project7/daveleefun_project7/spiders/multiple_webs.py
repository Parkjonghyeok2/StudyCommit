import scrapy
from daveleefun_project7.items import DaveleefunProject7Item

class MultipleWebsSpider(scrapy.Spider):
    name = "multiple_webs"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io"]

    def start_requests(self):
        urls = self.start_urls
        urls.extend([f'https://davelee-fun.github.io/page{i}' for i in range(2, 7)])
        for url in urls:
            print(url)
            yield scrapy.Request(url, self.parse)
        
    def parse(self, response):
        products = response.css('div.card.h-100') # getall() 은 태그를 문자열로만 가져오므로 객체로 가져옴
        for product in products:
            item = DaveleefunProject7Item()
            item['link'] = product.css('div.maxthumb > a::attr(href)').get()
            item['category'] = product.css('a.text-dark::text').get()
            item['title'] = product.css('h4.card-text::text').get()
            # 중첩된 태그 내의 TEXT 를 가져올 수 없음 (즉, 'span.post-name::text' 은 정상동작하지 않음)
            item['name'] = product.css('span.post-name a::text').get()
            item['date'] = product.css('span.post-date::text').get()
            yield item
