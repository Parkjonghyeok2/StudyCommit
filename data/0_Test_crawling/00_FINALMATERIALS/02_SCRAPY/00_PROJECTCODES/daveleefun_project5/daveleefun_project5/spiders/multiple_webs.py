import scrapy
from daveleefun_project5.items import DaveleefunProject5Item

class MultipleWebsSpider(scrapy.Spider):
    name = "multiple_webs"
    allowed_domains = ["davelee-fun.github.io"]
    
    def start_requests(self):
        urls = ['http://davelee-fun.github.io/']
        urls.extend([f'https://davelee-fun.github.io/page{i}' for i in range(2, 7)])
        for url in urls:
            yield scrapy.Request(url, self.parse)

    def parse(self, response):
        # 예를 들어, 페이지의 제목을 추출하고 저장합니다.
        titles = response.css('h4.card-text::text').getall()
        for title in titles:
            item = DaveleefunProject5Item()
            item['title'] = title
            yield item