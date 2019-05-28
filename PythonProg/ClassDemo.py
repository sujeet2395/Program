class Student:
    school='IPU'
    def __init__(self, name, m):
        self.name=name
        self.m=m
        self.lap=self.Laptop('HP','I3', 2)
    def getName(self):
        return self.name
    def show(self):
        print(self.name,self.m)
        self.lap.show()
    def comparem(self, s):
        return self.m==s.m
    @classmethod
    def compares(cls,s1, s2):
        return s1.m==s2.m and s1.school==cls.school
    @classmethod
    def getSchool(cls):
        return cls.school
    @staticmethod
    def info():
        return 'ipu_student'
    class Laptop:
        def __init__(self, brand, cpu, ram):
            self.brand=brand
            self.cpu=cpu
            self.ram=ram
        def show(self):
            print(self.brand, self.cpu, self.ram)
s1=Student('sujeet', 33)
s2=Student('sunil', 33)
print(s1.getName(),s1.m, s1.getSchool(), s1.info())
print(s2.getName(),s2.m, s2.getSchool(), s2.info())
print(Student.getSchool(), Student.info())
#Student.school='ipu' changes for all
#s1.school='ipus' changes only for s1
print(s1.getName(),s1.m, s1.getSchool(), s1.info())
print(s2.getName(),s2.m, s2.getSchool(), s2.info())
print(Student.getSchool(), Student.info())

print(s1.comparem(s2))
print(s1.school)
print(Student.compares(s1,s2))

s1.show()
s2.show()
lap1=Student.Laptop('Dell','i5', 4)
lap1.show()
l2=s1.lap
l2.show()
s2.lap.show()
