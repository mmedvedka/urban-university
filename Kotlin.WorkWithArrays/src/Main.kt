import java.lang.Math.pow

fun main() {
/**TODO
1. Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
2. Создать массив из 8 целых чисел. Найти среднее арифметическое его элементов.
3. Дан массив размерностью size. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
4. Дано целое число N(>0). Сформировать и вывести целочисленный массив размера N, содержащий степени двойки от первой до N-й: 2,4,8,16,….
 */
    //  1.
    println("1.")
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    val mulItems = arrayDouble.reduce { total, next -> total*next }
    println("Multiply of array items = $mulItems")

    //  2.
    println("2.")
    val arrayInt =  intArrayOf (1, 2, 3, 4, 5, 6, 7, 8)
    val avgItems = arrayInt.average()
    println("Average of array items = $avgItems")

    //  3.
    println("3.")
    val sizeArray = 15
    val arrayInt1 = Array<Int>(sizeArray){0}

    for (index in arrayInt1.indices){
        arrayInt1[index] = index
    }
    val arrayEven = arrayInt1.filter { num -> num % 2 == 0 }
    println("Even items is $arrayEven; count of even items = ${arrayEven.count()}")

    //  4.
    println("4.")
    val numN = 10
    val base = 2
    var curPower = 1
    val arrayInt2 = Array<Int>(numN){0}

    for (i in base..<numN+base) {
        curPower *= base
        arrayInt2[i-base] = curPower
    }

    println("Powers of two for $numN elements is ${arrayInt2.contentToString()}")

}