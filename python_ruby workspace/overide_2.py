class Cal(object):
    _history =[]
    def __init__(self, v1, v2):
        if isinstance(v1,int):
            self.v1=v1 
        if isinstance(v2,int):
            self.v2=v2
    def add(self):
        result = self.v1+self.v2
        Cal._history.append("add : %d+%d=%d" % (self.v1, self.v2, result))
        return result
    def subtract(self):
        result =  self.v1-self.v2
        Cal._history.append("subtract : %d-%d=%d" % (self.v1, self.v2, result))
        return result
    def setV1(self,v1):
        if isinstance(v1,int):
            self.v1=v1
    def getV1(self):
        return self.v1
    @classmethod
    def history(cls):
        for item in Cal._history:
            print(item)
    def info(self):
        return "Cal => v1 :%d, v2 :%d" %(self.v1, self.v2)

class Calmultiply(Cal): 
    #기본 계산기능 상속에다가 곱하기 추가
    #생성자는 부모 클래스 따라감
    def multiply(self):
        result = self.v1*self.v2
        Cal._history.append("multiply : %d*%d=%d" % (self.v1, self.v2, result))
        return result
    def info(self) : 
        return "Calmultiply => %s"%super().info()


class Caldivide(Calmultiply):
    #곱하기 추가된 기능 상속에다가 나누기 추가
    #생성자는 부모 클래스(곱하기) > 또 부모(계산기) 따라감
    def divide(self):
        result = self.v1/self.v2        
        Cal._history.append("divide : %d/%d=%d" % (self.v1, self.v2, result))
        return result
    def info(self) : 
        return "Caldivide => %s"%super().info()

c0 = Cal(30,60)
print(c0.info())
c1 = Calmultiply(10,20)
print(c1.info())   
c2 = Caldivide(20,4)
print(c2.info())
