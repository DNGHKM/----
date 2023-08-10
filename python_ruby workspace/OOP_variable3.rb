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

c1 = Cal.new(10,10)
p c1.add()
p c1.subtract()
c1.setV1(24)
p c1.add()
p c1.getV1()