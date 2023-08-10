class Cal(object):
    def __init__(self, v1, v2):
        if isinstance(v1,int):
            self.v1=v1 
        if isinstance(v2,int):
            self.v2=v2
    def add(self):
        return self.v1+self.v2
    def subtract(self):
        return self.v1-self.v2
    def setV1(self,v1):
        if isinstance(v1,int):
            self.v1=v1
    def getV1(self):
        return self.v1

class Calmultiply(Cal): 
    #기본 계산기능 상속에다가 곱하기 추가
    #생성자는 부모 클래스 따라감
    def multiply(self):
        return self.v1*self.v2


c1 = Calmultiply(10,20)
print(c1.add())
print(c1.multiply())

class Caldivide(Calmultiply):
    #곱하기 추가된 기능 상속에다가 나누기 추가
    #생성자는 부모 클래스(곱하기) > 또 부모(계산기) 따라감
    def divide(self):
        return self.v1/self.v2

c2=Caldivide(20,4)
print(c2.add())
print(c2.multiply())
print(c2.divide())
#위에꺼 다 상속해서 값 잘 나옴