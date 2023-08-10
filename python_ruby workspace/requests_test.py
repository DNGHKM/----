import requests
r = requests.get('https://codingeverybody.github.io/scraping_sample/1.html')

from bs4 import BeautifulSoup
soup = BeautifulSoup(r.text, 'html.parser')
print('Title : '+soup.title.string)
article = soup.findAll('div',{'class':'em'})
print('Article : '+article[0].text)

print('==============================')

import requests
r = requests.get('https://codingeverybody.github.io/scraping_sample/2.html')
from bs4 import BeautifulSoup
soup = BeautifulSoup(r.text, 'html.parser')
print('Title : '+soup.title.string)
article = soup.findAll('div',{'class':'strong'})
print('Article : '+article[0].text)