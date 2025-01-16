class Car (val weight: Int, var speed: Int) {
    fun drive() {
        this.speed = 100
    }

    fun stop() {
        this.speed = 0
    }

    override fun toString(): String {
        var result = when {
            this.speed == 0 -> "Car stopped: weight = "+this.weight.toString() +" speed = " + this.speed.toString()
            this.speed > 0 -> "Car drive: weight = "+this.weight.toString() +" speed = " + this.speed.toString()
            else -> ""
        }
        return result
     }
}