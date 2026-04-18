d = {}
N,M = list(map(int,input().split()))

for i in range(1,N+1):
    d[i] = set()

for i in range(M):
    x,y = list(map(int,input().split()))
    d[x].add(y)
    d[y].add(x)

for i in range(1,N+1):
    count = N - 1 - len(d[i])
    ways = (count*(count-1)*(count-2))//6
    print(ways,end=" ")