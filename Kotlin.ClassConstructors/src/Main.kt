fun main() {
/**TODO
1. Создать класс Box(коробка), у которого есть свойства width, height, depth.
   Написать функцию вычисления объёма коробки в классе Box. В классе с функцией main создать экземпляр класса Box, в конструктор класса передать свойства,
   задать им значения, вызвать функцию вычисления объема и вывести его на экран.
2. Дан набор из N чисел. Найти минимальный и максимальный из элементов данного набора и вывести их.
3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран элементы массива.
4. Дано целое число. Вывести его строку-описание вида «отрицательное четное число», «отрицательное нечетное число» «нулевое число»,
   «положительное нечетное число», «положительное четное число». int a = 34 à «положительное четное число»
5. Создайте класс Car. В классе есть конструктор с параметрами массы, скорости. В классе с функцией main создайте экземпляр этого класса и задайте там параметры в конструктор. Напишите функции движения и остановки автомобиля.
*/
   println("1.")
    val width = 10
    val height = 10
    val depth = 10
    val boxOne = Box(width, height, depth)
    println("Volume of Box(${boxOne.width}, ${boxOne.height}, ${boxOne.depth}) = ${boxOne.getVolume()}")

    println("2.")
    val setNumbers = setOf(11, 30, 8, 20, 15, 2, 6, 3)
    val minNum = setNumbers.min()
    val maxNum = setNumbers.max()
    println("For set of ${setNumbers.toIntArray().contentToString()}: ")
    println("Min value = $minNum")
    println("Max value = $maxNum")

    println("3.")
    val arrayNumbers = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println("ray of numbers ${arrayNumbers.contentToString()}: ")

    println("4.")
    var a = 34
    println(GetNumberDetails(a))
    a = -34
    println(GetNumberDetails(a))
    a = 0
    println(GetNumberDetails(a))
    a = 7
    println(GetNumberDetails(a))
    a = -7
    println(GetNumberDetails(a))

    println("5.")
    val car = Car(1500, 10)
    println(car.toString())

    car.stop()
    println(car.toString())

    car.drive()
    println(car.toString())
}

fun GetNumberDetails(num: Int): String{
    return "Int a = " + num.toString() + " " + when {
        (num == 0) -> {"«нулевое число»"}
        (num > 0) -> { if (num % 2 == 0) "«положительное четное число»" else "«положительное нечетное число»" }
        else -> { if (num % 2 == 0) "«отрицательное четное число»" else "«отрицательное нечетное число»" }
    }
}