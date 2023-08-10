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
