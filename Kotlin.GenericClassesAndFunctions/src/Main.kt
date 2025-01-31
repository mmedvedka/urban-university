import javax.lang.model.type.TypeVariable

fun main() {
/*
1. Написать функцию print(), которая на вход может принимать различные типы.
   Вызвать эту функцию несколько раз, поместив аргументы разных типов.
2. Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе может передаваться по – разному, как в виде числа, так и в виде строки.
   Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой.
   Вывести полученную информацию о них. Person: name = имя, phone = телефон
3. Написать функцию вывода в консоль переменных разных типов данных. Вторым параметром в функции будет тип Char и будет представлять то, во что будет оборачиваться переменная параметризованного типа, поступающая на вход в качестве первого параметра.
   Например, переменная Int должна оборачиваться в фигурные скобки. Пример ввода данных и полученного результата должен быть таким:
val a: Int = 10 -> {10}
val b: String = "Hello" -> [Hello]
val c: List<Int> = listOf(10, 16, 3) -> "[10, 16, 3]"
val d = 'f' -> (f)
*/
    println("1.")
    print(2025)
    print(1963.09)
    print("Обобщения - это круто!")
    print(arrayOf(1,2,3,4,5,6).contentToString())
    print(arrayOf("One", "Two", "Three", "Four", "Five").contentToString())

    println("2.")
    val personOne = Person("Иван", "9213334455")
    println("Person: name = ${personOne.name}, phone = ${personOne.phone}")
    val personTwo = Person("Мария", 9212223344)
    println("Person: name = ${personTwo.name}, phone = ${personTwo.phone}")

    println("3.")
    val a: Int = 10
    println("val a: Int = 10 -> ${convertVariable(a)}")
    val b: String = "Hello"
    println("val b: String = \"Hello\" -> ${convertVariable(b)}")
    val c: List<Int> = listOf(10,16,3)
    println("val c: List<Int> = listOf(10,16,3) -> ${convertVariable(c)}")
    val d = 'f'
    println("val d = \'f\' -> ${convertVariable(d)}")
}

fun <T> print(info: T) {
    println(info)
}

class Person<T>(val name: String, val phone: T)

fun <T> convertVariable(variable: T): String{
    if (variable is Int)
       return "{"+ variable.toString()+"}"
    else
    if (variable is String)
       return "[${variable.toString()}]"
    else
    if (variable is List<*>)
       return (variable as List<Int>).toIntArray().contentToString()
    else
    if (variable is Char)
       return "($variable)"
    else
       return ""
}