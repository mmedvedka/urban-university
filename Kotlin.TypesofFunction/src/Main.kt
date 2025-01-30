fun main() {
/*
1. Написать программу, которая будет вычислять факториал числа с применением рекурсии.
2. Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
3. Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
   Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.
   Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
*/
    println("1.")
    var numFact = 3
    val factorial: (Int) -> Int = ::getFactorial
    println("Факториал числа $numFact = ${factorial(numFact)}")
    numFact = 5
    println("Факториал числа $numFact = ${factorial(numFact)}")
    numFact = 7
    println("Факториал числа $numFact = ${factorial(numFact)}")

    println("2.")
    var numPow = 2
    var pow = 5
    val power: (Int, Int) -> Int = ::getPow
    println("Число $numPow в степени $pow  = ${power(numPow, pow)}")
    numPow = 3; pow = 3
    println("Число $numPow в степени $pow  = ${power(numPow, pow)}")

    println("3.")
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Исходный массив: ${array.contentToString()}\nРезультирующий массив: ${getCorrectedArray(array).contentToString()}")
}

fun getFactorial(num: Int): Int {
    return (
      if (num <= 1) 1 else num * getFactorial(num - 1)
    )
}

fun getPow(num: Int, p: Int): Int {
    return (
      if (p > 0) num * getPow(num, p - 1) else 1
    )
}

fun getCorrectedArray(array: Array<Int>): Array<Int> {
    for (i in array.indices)
        if ((i+1) % 2 != 0)
            array[i] += 1
    return array
}