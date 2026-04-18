def isVowel(c):
    c = c.lower()
    if(c == 'a' or c == 'e' or c == 'i' or c == 'u' or c == 'o'):
        return True
    return False

s = input().strip()

newstr = ""

for c in s:
    if(isVowel(c)):
        continue
    else:
        newstr += "." + c.lower()

print(newstr)