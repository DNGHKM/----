input_id =input("type the id\n")

def login(_id) :
    members=["dngh","puur"]
    for member in members :
        if member==_id : 
            return True
    return False
# -------------------------------            
if login(input_id):
    print("hello "+ input_id)
else :
    print("who are you")