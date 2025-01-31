fun main() {
/**TODO
1. Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.
2. Нужно осуществить проверку номера телефона. Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
   Если телефон верно введен, выведите true, иначе false.
3. Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
4. Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.
*/
    println("1.")
    val word = "Занятие"
    println(word.toCharArray().contentToString())

    println("2.")
    val correctedInfo = {check: Boolean -> if (check) "введен верно" else "введен неверно" }
    var phoneNumber = "+7990909999"
    println("Номер телефона \'$phoneNumber\' ${correctedInfo(checkIsCorrectPhoneNumber(phoneNumber))}")

    phoneNumber = "+89909099990"
    println("Номер телефона \'$phoneNumber\' ${correctedInfo(checkIsCorrectPhoneNumber(phoneNumber))}")

    phoneNumber = "+79909099990"
    println("Номер телефона \'$phoneNumber\' ${correctedInfo(checkIsCorrectPhoneNumber(phoneNumber))}")

    phoneNumber = "+7ABBA099990"
    println("Номер телефона \'$phoneNumber\' ${correctedInfo(checkIsCorrectPhoneNumber(phoneNumber))}")

    println("3.")
    val wordTwo = "Эта строка, но в обратном порядке"
    println("$wordTwo: ${wordTwo.reversed()}")

    println("4.")
    val wordThree = "kotlin2023course"
    val countDigit = wordThree.filter{it.isDigit()}.length
    println("Количество цифр в строке \'$wordThree\' = $countDigit")
}

fun checkIsCorrectPhoneNumber(phoneNumber: String): Boolean {
    if (phoneNumber.length != 12)
        return false
    if (phoneNumber.substring(0..1) != "+7")
        return false
    if (phoneNumber.substring(2..phoneNumber.length-1).filter { it.isLetter() }.isNotEmpty())
        return false
    return true
}