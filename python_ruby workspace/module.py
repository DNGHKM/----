import math

print(math.ceil(2.9))

print(math.floor(2.9))
print(math.sqrt(64))
# ----------------------------------

import module_dh as dh #as로 함수명 변경
from module_pr import d as z #module_pr 중 d 함수만 가져와서 as로 함수명 변경
print(dh.a())
print(z())

print(dh.c())