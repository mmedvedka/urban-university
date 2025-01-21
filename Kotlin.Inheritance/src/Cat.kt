class Cat(val catName: String, val catWeight: Int) : Animal(catName, catWeight) {
    override fun getType() = "Cat"

    override fun toEat(): String {
        return "fish"
    }

    fun meows(){
        println("${getType()} meows...")
    }
}