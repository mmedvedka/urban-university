import kotlin.math.pow

fun main() {
/**TODO
1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.
2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.
3. Написать программу, которая проверяет, является ли слово палиндромом.
*/
    println("1.")
    val intNumber = 545
    val binStr = getBinaryNumberFromDecimal(intNumber)
    println("Двоичное число от $intNumber = $binStr")

    println("2.")
    println("Десятичное число от $binStr = ${getDecimalNumberFromBinary(binStr)}")

    println("3.")
    val word = "ШАЛАШ"
    val checkword = CheckWordImpl (word)
    val polindrom = Polindrom(checkword)
    println(polindrom.toString())

    val word1 = "ШАБАШКА"
    val checkword1 = CheckWordImpl (word1)
    val polindrom1 = Polindrom(checkword1)
    println(polindrom1.toString())

    val word2 = "КАЗАК"
    val checkword2 = CheckWordImpl (word2)
    val polindrom2 = Polindrom(checkword2)
    println(polindrom2.toString())

}

fun getDecimalNumberFromBinary(binary: String): Int {
    var decimal: Long = 0
    for (i in binary.length - 1 downTo 0) {
        if (binary[i] == '1') {
            decimal += 2.0.pow((binary.length - i - 1).toDouble()).toLong()
        }
    }
    return decimal.toInt()
}

fun getBinaryNumberFromDecimal(intNumber: Int): String {
    var num = intNumber
    var binStr: String = ""

    while (num > 0) {
        val remainder = num % 2
        num /= 2
        binStr += remainder.toString()
    }
    return binStr.reversed()
}
