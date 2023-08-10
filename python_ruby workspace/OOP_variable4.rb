class C
    attr_reader :value #외부에서 value 접근가능하게(읽게)
    attr_writer :value #외부에서 value 접근가능하게(쓰게)
    attr_accessor :value #외부에서 value 접근가능하게(읽고 쓰게)
    def initialize(v)
        @value=v
    end
    def show()
        p @value
    end
end
                
c1 = C.new(10)
p c1.value
c1.value=20
p c1.value