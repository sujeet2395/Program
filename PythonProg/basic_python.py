#import numpy as np
#print ("Loading package(s)")

'''x=2
y=3
print(x+y)
print(x*y)
print(x/y)
print(x//y)
print(x-y)
name='sujeet'
print(name*10)
print(name+" sharma")
print(r"sujeet 's book in c:\book\new")
#name[1]='s' //error str is immutable
print(name[1:3], name[:3], name[1:], name[-1])
nums=[11,22,13,4,55]
print(nums, nums[1:4], nums[1:], nums[:4], nums[2], nums[-2])

nums.append(34)
nums.insert(2,23)
print(nums)
nums.remove(23)
print(nums)
print(nums.pop(1))
print(nums.pop())

lis=[2,7,4,'sune', 3]
print(lis, lis.append(2), lis.count(2), lis.index(3), lis[1:2], lis[1:], lis[:2], lis[2], lis[-1])
l=lis[:3]
l.sort()
print(l)
'''
'''
#tuple is immutable
tu=(2,87,34)
print(tu, tu.count(2), tu.index(34))

#set
se={2,3,24,73,3,4,2}
print(se.add(30), se, se.pop(), se.pop())
num=3
print(type(num),id(num))
num=4.3
print(type(num),id(num))
num='sun'
print(type(num),id(num))
print(type(num[0]), id(num[0]))#we use as character
'''
#import math
#from math import pow, sqrt
#print(sqrt(38), pow(2,4))
'''
a, b =4, 5
#print(a<b and b>a, a<b or b<a, not a<b)
print(a&b, b|a, a^b, ~a, ~a+1)
bs=a<b
print(bs, type(bs))

x=4
y=3
if x>y:
    print(x)
else:
    print(y)
num=int(input('Enter the number'))
if num==1:
    print('One')
elif num==2:
    print('Two')
elif num==3:
    print('Three')
else:
    print('Wrong')

for i in range(10):
    print(i)
for i in range(3,10,2):
    print(i)
for i in range(10,4,-2):
    print(i)
for i in range(4, 17):
    if i%3==0:
        continue
    print(i)

for i in range(4, 17):
    if i%7==0:
        break
    print(i)

for i in range(4, 17):
    if i%2!=0:
        pass
    else:
        print(i)
num=int(input('Enter the number to check prime'))
for i in range(2,num):
    if num%i==0:
        print('not prime')
        break
else:
    print('prime')
'''
import array as arr
nums=arr.array('i', [3,4,5,6,3,2,7,8])
for e in nums:
    print(e)
newArr=arr.array(nums.typecode, (a*3 for a in nums))
i=0
while i<len(newArr):
    print(newArr[i])
    i+=1;
userarr=arr.array('i',[])
n=int(input('Enter the lenght of array'))
for i in range(n):
    x=int(input('Enter the number'))
    userarr.append(x)
val=int(input('Enter the number for search'))
for i in range(n):
    if userarr[i]==val:
        print(i)
        break
print(userarr.index(val))
