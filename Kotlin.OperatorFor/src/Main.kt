import java.lang.Math.*
import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    /**TODO
        1.Даны два числа a и b. Найти их среднее арифметическое.
        2.Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L=π∗D, S=π∗D2/4.
          В качестве значения π использовать 3.14.
        3.Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2). Стороны прямоугольника параллельны осям координат.
          Найти периметр и площадь данного прямоугольника.
        4.Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        5.Дано целое число n = 20. Уменьшая его до 0, вывести на экран только четные числа.
    */
    println("1.")
    val numA = 100
    val numB = 200
    println("Average of A($numA) and B($numB) = ${(numA + numB) / 2}")
    val nums = listOf(numA, numB)
    var sum = 0
    for (i in nums) {sum += i}
    println("Average of A($numA) and B($numB) = ${sum / nums.size}")

    println("2.")
    val circleS = 100.0
    val circleD = sqrt(4 * circleS / PI)
    println(String.format("Area of circle is %.2f ; diameter is %.2f ; length is %.2f", circleS, circleD , PI * circleD))

    println("3.")
    val rectX1 = 0
    val rectY1 = 0
    val rectX2 = 200
    val rectY2 = 100
    val rectPerimeter = 2 * ((rectX2 - rectX1) + (rectY2 - rectY1))
    val rectArea = (rectX2 - rectX1) * (rectY2 - rectY1)
    println("For rectangle ($rectX1,$rectY1),($rectX2,$rectY2) perimeter = $rectPerimeter; area = $rectArea")

    println("4.")
    val base = 2
    var result = 1
    for (i in 0..<10) {
        print("$result ")
        result *= base
    }
    println()

    println("5.")
    for (i in 20 downTo 0 step 2){
        println(i)
    }
}