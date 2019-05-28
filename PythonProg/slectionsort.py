k1,s=map(int,input().split())
list1=list(map(int,input().split()))
print(k1,len(list1))
for j in range(0,s):
    mini=j
    for k in range(j+1,k1):
        if(list1[k]<list1[mini]):
            mini=k
    list1[j],list1[mini]=list1[mini],list1[j]
print(*list1)
