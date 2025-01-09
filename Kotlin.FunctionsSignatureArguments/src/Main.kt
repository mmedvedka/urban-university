fun main() {
/**TODO
1. Написать функцию возведения числа a в степень n.
2. Написать функцию, которая принимает два целых числа a и b (a<b).
   Она вычисляет произведение всех целых чисел от a до b включительно.
3. Написать функцию, которая принимает два целых числа a и b.
   Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.

*/

    println("1.")
    var num = 2
    var n = 5
    println("$num to power of $n = ${power(num, n)}")

    num = 2; n = -2
    println("$num to power of $n = ${power(num, n)}")

    println("2.")
    var a = 2
    var b = 5
    println("Multiplication between $a and $b = ${multbetween(a, b)}")

    a = 1; b = 6
    println("Multiplication between $a and $b = ${multbetween(a, b)}")

    println("3.")
    a = 96; b = 36
    println("Greatest common divisor $a and $b = ${calculateGCD(a, b)}")

    a = 75; b = 45
    println("greatest common divisor $a and $b = ${calculateGCD(a, b)}")
}

fun calculateGCD(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

fun multbetween (a: Int, b: Int) : Int{
    var result = 1
    for (i in a..b){
        result *=i
    }
    return result
}

fun power (num: Int, n: Int): Double{
    var result = 1.0
    if (n == 0){
        return result
    }
    else
    if (n < 0){
        for (i in n..-1) {
            result *= num
        }
        result = 1/result
    }
    else
    for (i in 1..n) {
        result *= num
    }
    return result
}