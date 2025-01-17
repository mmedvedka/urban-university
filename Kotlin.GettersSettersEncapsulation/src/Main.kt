fun main() {
/**TODO
1. Написать класс «Банковская карта». В нем создать свойства номера карты и код карты.
   В главной функции мы можем получить доступ к номеру карты, но не можем к коду.
   Есть функция, которая описывает, что данные карты будут доступны после ввода пароля.
2. Дана переменная a – целое число. Используя составные операторы присваивания необходимо выполнить операции:
   a увеличить на 7, полученное число уменьшить на 4, далее полученный результат умножить на 2
   и найти остаток от деления разделив на 3.
3. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 753 -> 357.
*/
    println("1.")
    val card = BankCard(number = "123456789", code = "111")
    println("Card number without password = [${card.cardNumber}]")
    card.password = "PaSsWoRd"
    println("Card number with password = [${card.cardNumber}]")

    println("2.")
    var a = 13
    a += 7
    a -= 4
    a *= 2
    a %= 3
    println("Result of operations = $a")

    println("3.")
    val num = 753
    var result = num.toString().reversed().toInt()
    println("Result of reversed number $num = $result")
}