import java.text.DecimalFormat


fun main() {
/**TODO
    1.Пользователь вводит с клавиатуры число. Требуется посчитать факториал числа.
      Например, если введено 3, факториал числа 1*2*3 = 6.
    2.Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет.
    3.Даны два целых числа A и B (A<B). Вывести в порядке возрастания все целые числа,
      расположенные между A и B (включая сами числа A и B), а также количество Nэтих чисел.
    4.Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления,
      вывести все его цифры, начиная с самой правой.
    5.Напишите программу, в которой выводятся на экран числа от 1 до 20 включительно со следующими условиями: если числа нечетные – их не выводить на экран, если делятся на 4 без остатка – умножаем на 2,
      если число равно 19 завершаем программу.
    6.За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которой вычисляется конечная сумму вклада с учетом начисления процентов за каждый месяц.
    Сумма вклада равна 350, количество месяцев – 9.
*/

    //  1.
    println("1.")
    var number: Int = 0
    var factorial = 1
    do {
        println("Enter number for factorial: ")
        number = readln().toInt()
        var i = 1
        factorial = 1
        while (i++ < number){
            factorial *= i;
        }
        println("Factorial $number -> $factorial")
    } while(number > 0)

    //  2.
    println("2.")
    var i = 0
    var price = 100.50
    var sum = 0.0
    while (i++ < 10) {
       sum = i*price
       println("Price of $i kg = $sum")
    }

    //  3.
    println("3.")
    var numA = 100
    val numB = 110
    var count: Int = 0
    do {
        println(numA)
        count++
    } while(++numA <= numB)
    println("Count of numbers: $count")

    //  4.
    println("4.")
    var numN = 1135
    while (numN > 0)
    {
        println(numN % 10)
        numN /= 10
    }

    //  5.
    println("5.")
    var intNum = 0
    while (++intNum <= 20){
        if (intNum == 19)
            break
        if (intNum % 2 == 0){
            if (intNum % 4 == 0){
                println(""+intNum*2+"($intNum)")
            }
            else {
                println(intNum)
            }
        }
    }

    //  6.
    println("6.")
    var monthCount = 9
    var month = 0
    val startSum = 350.0
    val percentMonth = 7
    var finalSum: Double = startSum
    while (++month <= monthCount){
        finalSum += finalSum * percentMonth / 100
    }
    println("Deposit amount = "+ String.format("%.2f",finalSum))
}