abstract class Shop(val name: String, val distance: Int) {
    var shopName = name
    var shopDistance = distance
    abstract fun getArea(): Int
    abstract fun getNumberFloors(): Int

    open fun getInfo(): String {
        return "Shop: $name, distance from home: $shopDistance, area: ${getArea()}, number of floors: ${getNumberFloors()}"
    }
}

class Magnit(): Shop("Магнит", 300){
    override fun getArea(): Int {
        return 2500
    }
    override fun getNumberFloors(): Int {
        return 2
    }
}

class Pyaterochka(): Shop("Пятерочка", 150){
    override fun getArea(): Int {
        return 3500
    }
    override fun getNumberFloors(): Int {
        return 3
    }
}