def count(lst):
    even=0
    odd=0
    for i in lst:
        if i%2==0:
            even+=1
        else:
            odd+=1
    return even,odd
def countName(lstname):
    co=0
    for n in lstname:
        if len(n)>4:
            co+=1
    return co
def fib(n):
    a=0
    b=1
    if n>0:
        if n==1:
            print(a)
        else:
            print(a)
            print(b)
            for i in range(2,n):
                c=a+b
                a=b
                b=c
                print(c)
def fact(n):
    f=1
    for i in range(2,n+1):
        f=f*i
    print(f)
def factr(n):
    if n<=1:
        return 1
    return n*factr(n-1)
def swap(alist,x, y):
    t=alist[x]
    alist[x]=alist[y]
    alist[y]=t

'''
lst=[2,5,6,7,8,4,1]
e,o=count(lst)
print('Even : {} and Odd : {}'.format(e,o))

lstname=['sujeet','sonu','sunil', 'kumar','monu']
co=countName(lstname)
print('name : ',co)

fib(6)
fib(1)
fib(-3)

fact(4)
fact(919)
'''
'''
f=factr(9) #stack limit 1000
print(f)
alist=[2,5,4,3,6,10,21]
swap(alist,0,1)
print(alist)
x,y=4,6
x,y=y,x
print(x, y)

#filter map reduce
from functools import reduce
evenlist=list(filter(lambda n: n%2==0, alist))
print(evenlist)
doubles=list(map(lambda n: n*2, evenlist))
print(doubles)
sumred=reduce(lambda x,y:x+y, doubles)
print(sumred)
'''
#decorator eg
def div(a, b):
    return a/b
def some_div(a, b):
    if a<b:
        a,b=b,a
    return div(a,b)
def somediv(func):
    def inner(a, b):
        if a<b:
            a,b=b,a
        return func(a,b)
    return inner
print(some_div(2,4))
print(div(2,4))
div1=somediv(div)
print(div1(2,4))
print(somediv(div)(2,4))
