class Cs :
    count = 0
    def __init__(self):
        Cs.count = Cs.count + 1
    @classmethod
    def getCount(cls):
        return Cs.count

i1 = Cs()
i2 = Cs()
i3 = Cs()
i4 = Cs()

print(Cs.getCount())
#몇개의 인스턴스가 생성됐는지 세는 메소드 정의