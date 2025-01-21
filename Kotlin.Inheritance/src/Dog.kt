class Dog(val dogName: String, val dogWeight: Int) : Animal(dogName, dogWeight) {
    override fun getType() = "Dog"

    override fun toEat(): String {
        return "meat"
    }

    fun barking(){
        println("${getType()} is barking...")
    }

}