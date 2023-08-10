class Cal
    @@_history = []
    def initialize(v1,v2) #여기서 V1은 지역변수임
        @v1=v1 #골뱅이는 인스턴스 변수임
        @v2=v2
    end
    def add()
        result = @v1+@v2
        @@_history.push("add : #{@v1}+#{@v2}=#{result}")
        return result
    end
    def subtract()
        result = @v1-@v2
        @@_history.push("subtract : #{@v1}-#{@v2}=#{result}")
        return result
    end
    def setV1(v1)
        if v1.is_a?(Integer)
        @v1=v1
        end
    end
    def getV1()
        return @v1
    end
    def Cal.history()
        for item in @@_history 
            p item
        end
    end
end

class Calmultiply < Cal
    #기본 계산기능 상속에다가 곱하기 추가
    #생성자는 부모 클래스 따라감    
    def multiply()
        result = @v1*@v2
        @@_history.push("multiply : #{@v1}*#{@v2}=#{result}")
        return result
    end
end

c1=Calmultiply.new(10,20)
p c1.add()
p c1.multiply()
p c1.subtract()

class Caldivide < Calmultiply
    #곱하기 추가된 기능 상속에다가 나누기 추가
    #생성자는 부모 클래스(곱하기) > 또 부모(계산기) 따라감
    def divide()
        result = @v1/@v2
        @@_history.push("divide : #{@v1}/#{@v2}=#{result}")
        return result
    end
end

c2=Caldivide.new(20,4)
p c2.add()
p c2.multiply()
p c2.divide()
Cal.history()
#위에꺼 다 상속해서 값 잘 나옴