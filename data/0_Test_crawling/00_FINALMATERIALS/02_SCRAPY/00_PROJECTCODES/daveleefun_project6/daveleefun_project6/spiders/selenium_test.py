import scrapy
from selenium import webdriver
from selenium.webdriver.common.by import By
import time 

class SeleniumTestSpider(scrapy.Spider):
    name = "selenium_test"
    allowed_domains = ["davelee-fun.github.io"]
    start_urls = ["https://davelee-fun.github.io/blog/TEST/index.html"]

    def __init__(self):
        headlessoptions = webdriver.ChromeOptions()
        headlessoptions.add_argument('headless')
        self.driver = webdriver.Chrome(options=headlessoptions)
                
    def parse(self, response):
        self.driver.get(response.url)
        time.sleep(2)
        
        elements = self.driver.find_elements(By.CSS_SELECTOR, ".news")
        for element in elements:
            yield { 'news': element.text }
        self.driver.quit()
