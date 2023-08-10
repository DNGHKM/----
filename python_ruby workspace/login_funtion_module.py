input_id =input("type the id\n")

import auth #auth 모듈파일을 불러와서 실행
# -------------------------------            
if auth.login(input_id):
    print("hello "+ input_id)
else :
    print("who are you")