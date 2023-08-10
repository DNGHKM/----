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
require_relative "Auth"
puts("type the id\n")
input_id=gets.chomp()

if Auth.login(input_id) 
    puts('hello '+input_id)    
else
    puts('who are you')
end