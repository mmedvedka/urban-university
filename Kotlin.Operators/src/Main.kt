import java.text.DecimalFormat
import kotlin.math.round

const val PI = 3.14

fun main() {
/**TODO
    1.Дана сторона квадрата a. Найти его периметр P=4∗a.
    2.Дана сторона квадрата a. Найти его площадь S=a*a
    3.Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
    4.Дан диаметр окружности d. Найти ее длину L=π∗d. В качестве значения π использовать константу 3.14.
    5.Дано расстояние L в сантиметрах. Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).
    6.Даны целые положительные числа A и B (A>B). На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
      Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
 */
    val a: Int = 10
    val b: Int = 15

    //  square
    var P = 4 * a
    var S = a * a
    println("P = $P | S = $S | A = $a")

    //  rectangle
    P = 2 * (a + b)
    S = a * b
    println("P = $P | S = $S | A = $a | B = $b")

    //  circle
    val df = DecimalFormat("#.###")
    val circleD: Double = 27.3
    val circleL = df.format(PI * circleD)
    println("D = $circleD | PI = $PI | L = $circleL")

    //  distance
    val distanceL: Int = 325
    val countMeters = distanceL / 100
    println("L = $distanceL | C = $countMeters")

    //  section
    val sectionA: Int = 700
    val sectionB: Int = 250
    val sectionCount = sectionA / sectionB
    println("A = $sectionA | B = $sectionB | C = $sectionCount")
}