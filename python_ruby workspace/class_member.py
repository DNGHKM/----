class Cs :
    @staticmethod
    #클래스에 직접 포함된 메소드를 의미함
    def static_method() :
        print("static method")
    @classmethod
    #클래스에 직접 포함된 메소드를 의미함
    def class_method(cls) : 
        print("Class method")
    def instance_method(self):
        print("instance method")

i = Cs()
Cs.static_method()
Cs.class_method()
i.instance_method()
