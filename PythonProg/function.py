def add(x, y):
    z=x+y
    print(z)
def add_r(x, y):
    z=x+y
    return z
def add_sub(x, y):
    z=x+y
    z2=x-y
    return z,z2
def person(name, age):
    print(name)
    print(age)
def pers(name, **data):
    print(name,data)
def add(x, y=3):
    z=x+y
    print(z)
def addz(x, *b):
    z=x
    for i in b:
        z=z+i
    print(z)
add(3,6) #function calling
print(add_r(3,6)) #returning func
z,z2=add_sub(3,6) #returning two value
print(z,z2)
person('sujee', 24) #keyword
person(age=39,name='suje') #positioning
add(3) #default argument
addz(3,5,1,32,7) #variable length arguments
pers('sik',age=34, city='delhi', mod=94949)


#global vs local
a=4
print(id(a))
def change_ul():
    a=2
    print('in fun use local',a)
def change_ug():
    print('in fun use global',a)
def change_g():
    global a
    a=2
    print('in fun changed',a)
def change_lg():
    a=2
    x=globals()['a']
    globals()['a']=3
    print(id(x))
    print('in fun local',a)

print(a)
change_ul()
print(a)
change_ug()
print(a)
change_g()
print(id(a))
print(a)
change_lg()
print(a)
