class Class1
    def method1()
        return 'm1'
    end
end

c1 = Class1.new()  
p c1.method1()  

class Class2
    def method2()
        return 'm2'
    end
end

class Class3 < Class2 #Class1 #루비는 다중상속이 안됨
#     # def method1(self) #만약 메소드가 클래스3에 먼저 있으면 해당 클래스 메소드를 실행
#     #     return 'm1-1' 
    def method3()
        return 'm3'
    end
end



c3 = Class3.new()
p c3.method2()
p c3.method3()



