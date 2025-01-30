fun main() {
/*
1. Написать анонимную функцию – поздравление с наступающим новым годом. Ее тип следующий (String, Int) -> String.
   Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют.
   Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
2. Создать массив целых чисел произвольного размера. Написать анонимную функцию isEven, проверяющую число на четность, она возвращает логический тип.
   Написать функцию checkArrayElement проверки массива и его элементов на четность, она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
3. Напишите анонимную функцию для объединения двух строк и возврата результата.
*/
    println("1.")
    val congratulation = fun (name: String, year: Int): String = "$name, поздравляю с $year-ым Новым годом!"
    println(congratulation("Иван", 2024))
    println(congratulation("Юлия", 2025))

    println("2.")
    val isEven = fun(num: Int): Boolean = num % 2 == 0
    val array = arrayOf(1,2,3,4,5,6,7,8,9)
    val result = checkArray(array, isEven)
    println("Результат проверки элементов массива ${array.contentToString()} на четность:\n${result.contentToString()}")

    println("3.")
    val strConcat = fun(str1: String, str2: String) = str1 + str2
    var str1 = "Маша "
    var str2 = "ела кашу"
    println("\'$str1\' + \'$str2\' = \'${strConcat(str1, str2)}\'")

    str1 = "Отличный "
    str2 = "день"
    println("\'$str1\' + \'$str2\' = \'${strConcat(str1, str2)}\'")

}

fun checkArray(array: Array<Int>, check: (Int) -> Boolean): BooleanArray {
    val result = array.map{check(it)}
    return result.toBooleanArray()
}