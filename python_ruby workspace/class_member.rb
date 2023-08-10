class Cs
    def Cs.class_method() #클래스에 직접 포함된 메소드를 의미함
        p "Class method"
    end
    def instance_method()
        p "instance_method"
    end
end

i = Cs.new()
Cs.class_method()
i.instance_method()
# Cs.instance_method()
i.class_method()