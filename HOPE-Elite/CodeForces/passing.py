n = int(input())
s = input()
hash = [0]*n
cnt = 0
k = 0
for i in range(n):
    if(hash[k] == 0):
        cnt += 1
        hash[k] = 1
    if s[i] == 'L':
        k -= 1
    else:
        k += 1

print(cnt)
