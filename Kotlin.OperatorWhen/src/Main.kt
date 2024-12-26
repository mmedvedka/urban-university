import kotlin.math.*

fun GetNameOfSeason (numMonth: Int) : String {
    var season: String = ""
    var month: String = ""

    month = when (numMonth){
        1 -> "Январь"
        2 -> "Февраль"
        3 -> "Март"
        4 -> "Апрель"
        5 -> "Май"
        6 -> "Июнь"
        7 -> "Июль"
        8 -> "Август"
        9 -> "Сентябрь"
        10 -> "Октябрь"
        11 -> "Ноябрь"
        12 -> "Декабрь"
        else -> ""
    }

    season = when (numMonth){
        1, 2, 12 -> "Зима"
        in (3..5) -> "Весна"
        in (6..8) -> "Лето"
        in (9..11)-> "Осень"
        else -> ""
    }

    return "«"+season +": "+month+".»"
}
fun GetNameOfTimeDay (numHour: Int) : String {
    var timeName = when (numHour){
        in 0..5 -> "Раннее утро"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 17..20 -> "Вечер"
        in 20..23 -> "Поздний вечер"
        else -> ""
    }
    return timeName
}

fun main() {
/**TODO
1.Дан порядковый номер месяца года. Нужно написать программу, которая будет выводить на экран время года и название месяца.
  Пример вывода: «Зима: Январь.»
2.Дана переменная с плавающей точкой. Написать программу, которая округляет эту переменную до целого числа.
3.Написать программу, которая определяет время суток. Допустим с 0 часов до 5 -"Раннее утро", с 6 до 11 – утро, с 12 до 17 - день, с 17 – 20 – вечер, после 20 до 23 – поздний вечер.
4.Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
 */
    //  1.
    println("1.")
    var numMonth = 12
    println("$numMonth -> "+GetNameOfSeason(numMonth))
    numMonth = 4
    println("$numMonth -> "+GetNameOfSeason(numMonth))
    numMonth = 7
    println("$numMonth -> "+GetNameOfSeason(numMonth))

    //  2.
    println("2.")
    var numDouble: Double
    numDouble = 18.345
    println("$numDouble (with toInt) -> "+numDouble.toInt())
    println("$numDouble (with roundToInt) -> "+numDouble.roundToInt())
    println("$numDouble (with truncate) -> "+truncate(numDouble).toInt())
    println("$numDouble (with ceil) -> "+ceil(numDouble).toInt())
    println("$numDouble (with floor) -> "+floor(numDouble).toInt())
    numDouble = 31.546
    println("$numDouble (with toInt) -> "+numDouble.toInt())
    println("$numDouble (with roundToInt) -> "+numDouble.roundToInt())
    println("$numDouble (with truncate) -> "+truncate(numDouble).toInt())
    println("$numDouble (with ceil) -> "+ceil(numDouble).toInt())
    println("$numDouble (with floor) -> "+floor(numDouble).toInt())

    //  3.
    println("3.")
    var numHour = 4
    println("$numHour -> "+GetNameOfTimeDay(numHour))
    numHour = 10
    println("$numHour -> "+GetNameOfTimeDay(numHour))
    numHour = 17
    println("$numHour -> "+GetNameOfTimeDay(numHour))
    numHour = 20
    println("$numHour -> "+GetNameOfTimeDay(numHour))
    numHour = 22
    println("$numHour -> "+GetNameOfTimeDay(numHour))

    //  4.
    println("4.")
    var a = 8
    var b = 5
    println("It was: a -> $a; b -> $b")
    when {
        (a == 8) -> a = 5
        (b == 5) -> b = 8
    }
    println("Has become: a -> $a; b -> $b")
}