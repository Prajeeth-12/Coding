t = int(input())
while(t > 0):
    s = input()
    n = len(s)
    lst = []
    for i in range(n):
        if s[i] != '0':
            power = n - 1 - i
            lst.append(s[i] + '0' * power)
    print(len(lst))
    print(*(lst))
    t-=1