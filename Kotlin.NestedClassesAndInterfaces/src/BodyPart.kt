open class BodyPart(val name: String) {
    val partName: String = name

    interface Function {
        fun getInfo(): String
    }
}