open class Animal(val animalName: String, val animalWeight: Int) {
    var name: String = animalName
    var weight: Int = animalWeight

    open fun getType() = "Animal"

    open fun toEat(): String {
        return "meat"
    }

    override fun toString(): String {
        return "${getType()} {name: ${this.name}, weight: $weight}"
    }
}