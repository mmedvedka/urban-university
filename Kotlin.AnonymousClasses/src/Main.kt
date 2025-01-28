fun main() {
/**TODO
1. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
2. Посчитать сумму элементов побочной диагонали матрицы 4х4.
3. Написать абстрактный класс Printer со своими свойствами и функциями.
  В функции main создать несколько объектов Printer.
*/
    println("1.")
    val words = arrayOf("word", "two words", "one of words", "thegalaxyishugeoneword", "the galaxy is huge")
    val longWord = words.maxBy { it.length }
    println("Самое длинное слово в массиве ${words.contentToString()}: \n$longWord, кол-во символов: ${longWord.length}")

    println("2.")
    val matrix44 = arrayOf(
      intArrayOf(17, 12, 19, 31),
      intArrayOf(25, 36, 18, 45),
      intArrayOf(40, 50, 10, 25),
      intArrayOf(60, 36, 80, 70)
    )
    val n = 4
    var sumSD = 0
    for (i in 0..n-1)
      sumSD += matrix44[i][n-1-i]
    println("Сумма элементов побочной диагонали матрицы = $sumSD")

    println("3.")
    val laser = object : Printer("Лазерный") {
      override val speed = 200
      override val resolution = 100
      val warmtime = 2
      override fun getInfo(): String {
        return "Принтер - $type, ${getColorType()}; скорость печати: $speed; разрешение: $resolution; время прогрева: $warmtime мин"
      }
    }

    val inkjet = object : Printer("Струйный") {
      override val speed = 30
      override val resolution = 300
      override val colors = 65000
      val cartridges = 5
      override fun getInfo(): String {
        return "Принтер - $type, ${getColorType()}(к-во цветов $colors); скорость печати: $speed; разрешение: $resolution; к-во картриджей: $cartridges"
      }
    }
    println(laser.getInfo())
    println(inkjet.getInfo())
}