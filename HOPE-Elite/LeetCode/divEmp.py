n = int(input())
ways = 0
for i in range(1,n):
    tl = i
    emp = n-i
    if(emp%tl == 0):
        ways+=1

print(ways)