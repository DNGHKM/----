class Cs
    @@count = 0
    def initialize()
        # @count 인스턴스에 속함
        @@count = @@count + 1 #클래스에 속함
    end
    def Cs.getCount()
        return @@count  
    end
end


i1 = Cs.new()
i2 = Cs.new()
i3 = Cs.new()
i4 = Cs.new()

p Cs.getCount()
#몇개의 인스턴스가 생성됐는지 세는 메소드 정의