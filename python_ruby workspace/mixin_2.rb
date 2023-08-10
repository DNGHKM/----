module Multiply
    def multiply()
        result = @v1*@v2
        return result
    end
end

module Divide
    def divide()
        result = @v1/@v2
        return result
    end
end

class Cal
    include Multiply,Divide
    def initialize(v1,v2) #여기서 V1은 지역변수임
        @v1=v1 #골뱅이는 인스턴스 변수임
        @v2=v2
    end
    def add()
        result = @v1+@v2
        return result
    end
    def subtract()
        result = @v1-@v2
        return result
    end
end

c = Cal.new(100,10)
p c.add()
p c.multiply()
p c.divide()