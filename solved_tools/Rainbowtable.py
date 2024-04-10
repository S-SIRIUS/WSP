import hashlib

def makehash(ans):
    for i in range(10000000,99999999):
        print(i)
        sha=str(i)+"salt_for_you"
        for j in range(0, 500):
            sha = hashlib.sha1(sha.encode()).hexdigest()
        if(sha==ans):
            return str(i)

original=makehash("1a46f151b683accf058f2335c4e5c9b3b2ccef21")
original = original+"salt_for_you"
print(original)