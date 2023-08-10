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

class Calmultiply(): 
    #기본 계산기능 상속에다가 곱하기 추가
    #생성자는 부모 클래스 따라감
    def multiply(self):
        result = self.v1*self.v2
        Cal._history.append("multiply : %d*%d=%d" % (self.v1, self.v2, result))
        return result


c1 = Calmultiply(10,20)
print(c1.add())
print(c1.multiply())

class Caldivide(Cal, Calmultiply):
        #순차 상속이 아닌 다중상속 처리함(후속 연습)
    def divide(self):
        result = self.v1/self.v2        
        Cal._history.append("divide : %d/%d=%d" % (self.v1, self.v2, result))
        return result
    
c2=Caldivide(20,4)
print(c2.add())
print(c2.multiply())
print(c2.divide())
Cal.history()
#위에꺼 다 상속해서 값 잘 나옴