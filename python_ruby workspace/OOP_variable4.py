class C:
    def __init__(self,v) :
        self.__value=v 
        #언더바 두개 앞에 붙히면 인스턴스 밖에서는 접근 못하게 막음
    def show(self) :
        print(self.__value)
                
c1 = C(10)
c1.show()
# print(c1.__value)
# c1.__value=24
# print(c1.__value)
