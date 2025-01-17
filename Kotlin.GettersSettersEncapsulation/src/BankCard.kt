class BankCard(val number: String, val code: String, val pass: String = "") {
    private val cardCode: String = code
    var cardNumber: String = number
        //  getter with check password
        get() {
            if (this.password.isEmpty()){
                println("The card data will be available after entering the password!")
                return ""
            }
            return field
        }
        set(value) {
            field = value
        }

    var password: String = pass
        set(value) {
            if (value.length < 6){
                println("Length of password is too short (${value.length})!")
                return
            }
            field = value
        }
}