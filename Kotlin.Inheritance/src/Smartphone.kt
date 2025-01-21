open class Smartphone(name: String, width: Int, length: Int, color: String) {
    var smartName = name
    var smartWith = width
    var smartLength = length
    var smartColor = color

    fun makeCall(){
        println("Make a call")
    }

    override fun toString(): String {
        return "name: $smartName; width: $smartWith, length: $smartLength, color: $smartColor"
    }
}

open class IPhone(): Smartphone("IPhone", 120, 60, "White"){
    fun takePhoto(){
        println("Take a photo...")
    }
}

open class Sony(): Smartphone("Sony", 110, 50, "Black"){
    fun playMusic(){
        println("Play music...")
    }
}

open class Nokia(): Smartphone("Nokia", 100, 45, "Blue"){
    fun playGame(){
        println("Play the game...")
    }
}
