# puts("type the id\n")
# in_str=get.chomp()
# members=["dngh","puur"]

# for member in members do
#     if member==in_str
#         puts("hello!, "+member)
#         exit
#     end
# end

# puts("who are you")

puts("type the id\n")
input_id=gets.chomp()
module Auth
    module_function()
    def login(_id)
    members=["dngh","puur"]
        for member in members do
            if member==_id
                return true
            end
        end
        return false
    end
end

if Auth(input_id) 
    puts('hello '+input_id)    
else
    puts('who are you')
end