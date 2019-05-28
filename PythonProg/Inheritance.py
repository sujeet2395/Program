class A:
    def __init__(self):
        print('in A init')
    def feature1(self):
        print('feature 1 s')
class B(A):
    def __init__(self):
        #super().__init__()
        print('in B init')
    def feature2(self):
        print('feature 2 s')

#Single level
b=B()
b.feature1()
b.feature2()

#multilevel 
class AA:
    def __init__(self):
        print('in AA init')
    def feature1(self):
        print('feature 1 m')
class BB(AA):
    def __init__(self):
        super().__init__()
        print('in BB init')
    def feature2(self):
        print('feature 2 m')
class CC(BB):
    def __init__(self):
        super().__init__()
        print('in CC init')
    def feature3(self):
        print('feature 3 m')

cc=CC()
cc.feature1()
cc.feature2()
cc.feature3()

#multiple
class AAA:
    def __init__(self):
        print('in AAA init')
    def feature1(self):
        print('feature 1 AAA ml')
class BBB:
    def __init__(self):
        print('in BBB init')
    def feature1(self):
        print('feature 2 BBB ml')

#calling of init as order of Mention of Classes while inheriting
class CCC(AAA,BBB):
    def __init__(self):
        super().__init__()
        print('in CCC init')
    def feature1(self):
        super().feature1()
        print('feature 1 CCC ml')

ccc=CCC()
ccc.feature1()
#ccc.feature2()
#ccc.feature3()
