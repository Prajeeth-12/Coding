t = int(input())
while(t > 0):
    words = input().split()
    nwrd1,nwrd2 = words[1][0] + words[0][1:], words[0][0] + words[1][1:]

    print(nwrd1,nwrd2)
    t-=1
