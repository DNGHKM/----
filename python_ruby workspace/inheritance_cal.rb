class Cal
    def initialize(v1,v2) #여기서 V1은 지역변수임
        @v1=v1 #골뱅이는 인스턴스 변수임
        @v2=v2
    end
    def add()
        return @v1+@v2
    end
    def subtract()
        return @v1-@v2
    end
    def setV1(v1)
        if v1.is_a?(Integer)
        @v1=v1
        end
    end
    def getV1()
        return @v1
    end
end

class Calmultiply < Cal
    #기본 계산기능 상속에다가 곱하기 추가
    #생성자는 부모 클래스 따라감    
    def multiply()
        return @v1*@v2
    end
end

c1=Calmultiply.new(10,20)
p c1.add()
p c1.multiply()

class Caldivide < Calmultiply
    #곱하기 추가된 기능 상속에다가 나누기 추가
    #생성자는 부모 클래스(곱하기) > 또 부모(계산기) 따라감
    def divide()
        return @v1/@v2
    end
end

c2=Caldivide.new(20,4)
p c2.add()
p c2.multiply()
p c2.divide()
#위에꺼 다 상속해서 값 잘 나옴