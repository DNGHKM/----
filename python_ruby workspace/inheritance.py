class class1(object):
    def method1(self):
        return 'm1'
    
class class2(object):
    def method2(self):
        return 'm2'

class class3(class1,class2): #클래스 1과 2를 상속함
    # def method1(self): #만약 메소드가 클래스3에 먼저 있으면 해당 클래스 메소드를 실행
    #     return 'm1-1' 
    def method3(self):
        return 'm3'

c3 = class3()
print(c3.method1())
print(c3.method2())
print(c3.method3())



