fun NumberIsSimple (num: Int) : Boolean{
    var isSimple = true
    if (num <= 1) {
        isSimple = false
    }
    for (i in 2..<num) {
        if (num % i == 0) {
            println("Number $num divisible by $i !")
            isSimple = false
            break
        }
    }
    return isSimple
}

fun main() {
/*TODO
1.Дано целое число n (>0). Найти сумму 1+1/2+1/3+…+1/n (вещественное число).
2.Даны два целых числа a и b (a<b).
  Найти сумму квадратов всех целых чисел от a до b включительно.
3.Даны целые числа A и B (A<B). Вывести все целые числа от A до B включительно;
  при этом число A должно выводиться 1 раз, число A+1 должно выводиться 2 раза и т. д.
  (допустим a = 3, b = 5 à 3,4,4,5,5,5)
4.Дано число n. Написать программу, которая проверяет, является ли оно простым.
5.Есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?" Ответ: троллейбус.
  Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ.
 */
    //  1.
    println("1.")
    val numN = 50
    var sumN = 0.0
    for (i in 1..numN){
        sumN += 1.0/i
    }
    println(String.format("Sum values for N = %d is %.4f", numN, sumN))

    //  2.
    println("2.")
    val a = 2
    val b = 5
    var sumQ = 0
    for (i in a..b ){
        sumQ += i*i
    }
    println("Sum of values for a=$a and b=$b is $sumQ")

    //  3.
    println("3.")
    val numA = 2
    val numB = 7
    var posD = 1
    for (i in numA..numB){
        for(j in 1..posD){
            print(i)
        }
        posD++
    }
    println()

    //  4.
    println("4.")
    var testNum = 7    //  must be > 1
    println("Number $testNum is simple = ${NumberIsSimple(testNum)}")
    testNum = 11
    println("Number $testNum is simple = ${NumberIsSimple(testNum)}")
    testNum = 111
    println("Number $testNum is simple = ${NumberIsSimple(testNum)}")
    testNum = 113
    println("Number $testNum is simple = ${NumberIsSimple(testNum)}")

    //  5.
    println("5.")
    val goodStr = "троллейбус"
    val capitulateStr = "сдаюсь"
    var inputStr: String = ""
    val limitAttempts = 3
    var attempt = 1
    println( "Что это такое: синий, большой, с усами и полностью набит зайцами?")
    do {
        inputStr = readln().toString()
        if (inputStr.equals(goodStr)){
            println("Правильно!")
            break
        }
        else
        if (inputStr.equals(capitulateStr)){
           println("Правильный ответ: $goodStr.")
           break
        }
        else
        {
            if (++attempt <= limitAttempts) {
               println("Подумай еще.")
            }
            else {
                println("Превышен лимит попыток ($limitAttempts)!")
            }
        }
    } while(attempt <= limitAttempts)
}