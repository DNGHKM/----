def a3()
print("aaa")
end
a3()
# 함수 내에서 aaa를 출력함

def a3()
return "aaa"
end
puts(a3())
# 함수 내에서는 aaa라는 값을 리턴만 하고
# 이후에 출력함
# 리턴하는 이 함수가 더 범용성이 높음