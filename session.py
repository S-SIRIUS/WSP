import requests
import json
session=requests.session()

info={}
info['id']=input("id:")
info['pw']=input("pw:")
print(info)
jinfo=json.dumps(info)
response=session.post("https://webhacking.kr/login.php?login",data=jinfo)
print(response.text)
for i in range(100):
    response=session.get("https://webhacking.kr/challenge/code-5/?hit="+info["id"])
    print(response.text)
    session.cookies.__delitem__("vote_check")