fun main() {
/**TODO
1. Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.
   Например, чтобы передаваемое сообщение в print() выводилось count раз.
2. Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.
3. Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.
4. Напишите программу, которая реализует лямбда-выражение для работы с массивом целых чисел таким образом, что его четные элементы делятся на 2, нечетные – умножаются на 3.
*/
    println("1.")
    val showMsg = {mes: String -> println(mes)}
    repeatMsg("Привет Котлин!", 6, showMsg)

    println("2.")
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
    val midNum = {arr: Array<Int> -> arr.sum() * 1.0 / arr.size}
    val result = midNum(array)
    println("Среднее арифметическое массива ${array.contentToString()} = ${result.toString()}")

    println("3.")
    val mixed = arrayOf(-1,2,-3,4,-5,6,-7,8,-9,10,-11)
    val positives = mixed.filter { it > 0 }.toIntArray()
    println("Положительные элементы массива ${mixed.contentToString()}:\n${positives.contentToString()}")

    println("4.")
    val arraySrc = arrayOf(1,2,3,4,5,6,7,8,9,10,11)
    val recalc = {num: Int -> if (num % 2 == 0) num / 2 else num * 3}
    val arrayDst = arraySrc.map{recalc(it)}.toIntArray()
    println("Результат трансформации массива  ${arraySrc.contentToString()}:\n${arrayDst.contentToString()}")
}

fun repeatMsg(msg: String, count: Int, show: (String) -> Unit) {
    for (i in 1..count) show(msg)
}