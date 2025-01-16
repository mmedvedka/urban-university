class Registration {
    private var email: String = ""
    private var password: String = ""

    fun getEmail(): String {
        return email.uppercase()
    }

    fun getPassword() = password

    fun setPassword(value: String){
        if (value.length < 6){
            println("The password must be at least 6 characters long (${value.length})!!!")
            return
        }
        password = value
    }

    fun setEmail(value: String){
        email = value
    }
}