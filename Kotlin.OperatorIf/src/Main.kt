import kotlin.*


fun main() {
/**TODO
1.Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его.
  Вывести полученное число.
2.Даны целые числа: 4, 45, -2, 8. Найти количество положительных чисел в исходном наборе.
3.Даны два числа. Вывести большее из них.
4.Дано целое число в диапазоне 1–7. Вывести строку — название дня не дели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
5.Дано целое число K. Вывести строку-описание оценки, соответствующей числу (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
  Если не лежит в диапазоне 1–5, то вывести строку «ошибка».
6.Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан номер действия (целое число в диапазоне 1–4) и числа типа double(не равно 0).
  Выполнить над числами указанное действие и вывести результат.
 */
    //  1.
    var numInt: Int = 10;
    if (numInt > 0) {
        numInt++
    }
    println("1. value of num = $numInt")

    //  2.
    val nums = arrayOf(4, 45, -2, 8)
    var countPos = 0;
    for (num in nums){
        if (num > 0){
            countPos++
        }
    }
    println("2. count of positive = $countPos")

    //  3.
    val a: Int = 20
    val b: Int = 30
    val resMax = if (a > b) a else b
    println("3. result of max = $resMax")

    //  4.
    val numDay = 4;
    if (numDay == 1) {
        println("4. $numDay - «понедельник»")
    }
    else
    if (numDay == 2) {
        println("4. $numDay - «вторник»")
    }
    else
    if (numDay == 3) {
        println("4. $numDay - «среда»")
    }
    else
    if (numDay == 4) {
        println("4. $numDay - «четверг»")
    }
    else
    if (numDay == 5) {
        println("4. $numDay - «пятница»")
    }
    else
    if (numDay == 6) {
        println("4. $numDay - «суббота»")
    }
    else {
        println("4. $numDay - «воскресенье»")
    }

    //  5.
    val K = 5;
    if (K == 1) {
        println("5. $K - «плохо»")
    }
    else
    if (K == 2) {
        println("5. $K - «неудовлетворительно»")
    }
    else
    if (K == 3) {
        println("5. $K - «удовлетворительно»")
    }
    else
    if (K == 4) {
        println("5. $K - «хорошо»")
    }
    else
    {
        println("5. $K - «отлично»")
    }

    val op = 2
    val a = 10
    val b = 5
    val result = 0;
    if (op == 1){
       result = a + b
    }
    else
    if (op == 2){
       result = a + b
    }
    else
    if (op == 3){
       result = a * b
    }
    else
    if (op == 4){
       result = a / b
    }
    println("6. $op - result $result")
}