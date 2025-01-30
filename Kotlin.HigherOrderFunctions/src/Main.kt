fun main() {
/**TODO
1. Написать функцию высшего порядка action, которая на вход принимает значения двух цветов типа String.
   Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action,
   она же возвращает строку – получившейся цвет.
   Функция action возвращает результат в виде строки смешанный цвет из двух заданных.
2. Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два.
   Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым параметром функцию, принимающую число и возвращающая число.
   Функция высшего порядка будет возвращать измененный массив,
   который будет получаться за счет вызова внутри нее у этого массива функции map, внутри которой будет вызываться функция изменения числа.
*/

    println("1.")
    val colorOp: (String, String) -> String = ::addColor
    var color1 = "RED"
    var color2 = "YELLOW"
    var colorMix = getMixedColor(color1, color2, colorOp)
    println("$color1 + $color2 = $colorMix")

    color1 = "RED"
    color2 = "BLUE"
    colorMix = getMixedColor(color1, color2, colorOp)
    println("$color1 + $color2 = $colorMix")

    color1 = "YELLOW"
    color2 = "BLUE"
    colorMix = getMixedColor(color1, color2, colorOp)
    println("$color1 + $color2 = $colorMix")

    println("2.")
    val array = arrayOf(1,2,3,4,5,6,7,8,9)
    val incOp = ::inc
    val mul2Op = ::mul2

    var result = recalcArray(array, incOp)
    println("Результат инкремента элементов массива ${array.contentToString()}:\n${result.contentToString()}")

    result = recalcArray(array, mul2Op)
    println("Результат умножения на 2 элементов массива ${array.contentToString()}:\n${result.contentToString()}")
}

//  1.
fun addColor(color1: String, color2: String): String {
    /*
        red + yellow = orange
        red + blue = purple
        yellow + blue = green
    */

    if (color1 == "RED" && color2 == "YELLOW")
        return "ORANGE"
    else
    if (color1 == "RED" && color2 == "BLUE")
        return "PURPLE"
    else
    if (color1 == "YELLOW" && color2 == "BLUE")
        return "GREEN"
    else
        return "UNKNOWN"
}

fun getMixedColor(color1: String, color2: String, mix: (String, String) -> String): String {
    return mix(color1, color2)
}

//  2.
fun inc(num: Int): Int = num + 1

fun mul2(num: Int): Int = num * 2

fun recalcArray(array: Array<Int>, op: (Int) -> Int): IntArray {
   return array.map {op (it)}.toIntArray()
}
