
abstract class Printer(val type: String) {
    open val colors: Int = 2
    open val speed: Int = 100
    open val resolution: Int = 500

    fun getColorType(): String {
        return if (colors > 2) "Цветной" else "Черно-белый"
    }

    abstract fun getInfo(): String
}