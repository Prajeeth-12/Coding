n, t = map(int, input().split())
lst = list(map(int, input().split()))

i = 0
curTime = 0
maxbks = 0
for j in range(n):
    curTime += lst[j]
    while curTime > t:
        curTime -= lst[i]
        i += 1
    maxbks = max(maxbks, j - i + 1)

print(maxbks)