n = int(input())
cnt = 0
mx = 0
for i in range(n):
    num = int(input())
    if(num >= mx):
        mx = num
        cnt += 1
print(cnt)