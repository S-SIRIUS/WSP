import pybase64
id1="admin"
pw="nimda"
blacklist=["1","2","3","4","5","6","7","8"]
dic={"1":"!", "2":"@", "3":"$","4":"^", "5":"&", "6":"*", "7":"(", "8":")"}
def encode20(target):
    for i in range(0, 20):
        targetbytes = target.encode('UTF-8')
        results = pybase64.b64encode(targetbytes)
        target = results.decode('utf-8')
    return target

def change(target):
    for i in target:
        if i in blacklist:
            target=target.replace(i,dic[i])
    return target

print(change(encode20(id1)))
print("구분자\n\n")
print(change(encode20(pw)))