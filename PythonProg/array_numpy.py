from numpy import *
'''
num=array([4, 5, 5, 6], int)
print(num)

num=linspace(4,40,10)
print(num)

num=logspace(1, 12, 8)
print(num)
print('%.2f' %num[7])

num=zeros(15)
print(num)

num=ones(28)
print(num)
'''
'''
arr1=array([3,5,6],int)
arr2=arr1 #aliasing
print(arr1, arr2)
print(id(arr1), id(arr2))
arr1[1]=9
print(arr1, arr2)
print(id(arr1), id(arr2))


arr3=arr1.view() #swallow copy
print(arr1, arr3)
print(id(arr1), id(arr3))
arr1[1]=0
print(arr1, arr3)
print(id(arr1), id(arr3))

arr4=arr1.copy() #deep copy
print(arr1, arr4)
print(id(arr1), id(arr4))
arr1[1]=8
print(arr1, arr4)
print(id(arr1), id(arr2))


#vectorised operation
print(arr1+arr2)
print(sin(arr1))
print(concatenate([arr1,arr4]))
print(type([arr1,arr4]))
'''
#matrices
arr1=array([3,5,6],int)
m=matrix(arr1)
m=matrix('2 4 5; 5 2 1; 4 2 1')
print(m)
print(diagonal(m))
m2=m+m
print(m2)
m3=m*m
print(m3)



