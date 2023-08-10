class C1():
    def c1_m(self):
        print("c1_m")

class C2():
    def c2_m(self):
        print("c2_m")

class C3(C1, C2):
    pass

a1=C3()
a1.c1_m()
a1.c2_m()

#다중상속은 신중하게 사용하라(오류가능성 높음)