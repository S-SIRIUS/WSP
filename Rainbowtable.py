import hashlib

def makehash(ans):
    for i in range(10000000,99999999):
        print(i)
        sha=str(i)+"salt_for_you"
        for j in range(0, 500):
            sha = hashlib.sha1(sha.encode()).hexdigest()
        if(sha==ans):
            return i

original=makehash("df8d533aa927cf060f44aefb88a1a5d2066681dc")
original = original+"salt_for_you"
print(original)