module Dngh #모듈 정의는 반드시 대문자 시작
    module_function() #모듈화 하는 역할임
    def a()
        return 'a'
    end

    def b()
        return 'b'
    end
    
    def c()
        return 'c'
    end
end

require './module_pr' #./는 현재 디렉토리 의미함
puts(Dngh.a())
puts(Prpr.d())