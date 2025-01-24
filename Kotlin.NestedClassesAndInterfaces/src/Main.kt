fun main() {
/**TODO
1. Создать класс Human(человек). В нем создать несколько внутренних классов, например,
  head(голова), legs(ноги), в каждом из классов напишите функции этой части тела.
  В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
2. Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов". Написать программу поиска и вывода на экран элементов массива по вводимым символам.
3. Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд. Посчитать количество элементов, которые находятся между нолями.
*/
    println("1.")
    val human = Human("Иван", "Москва")
    val head = Human.Head()
    val legs = Human.Legs()
    val hands = Human.Hands()
    println("${human.toString()} и у него есть части тела:" +
            "\n ${head.getInfo()}" +
            "\n ${hands.getInfo()}" +
            "\n ${legs.getInfo()}"
    )

    println("3.")
    val arrayInt = arrayOf(1, 2, 0, 3, 4, 5, 6, 7, 0, 8, 9)
    val firstIdx = arrayInt.indexOf(0)
    val lastIdx = arrayInt.lastIndexOf(0)
    val countBetween = lastIdx - firstIdx - 1
    println("Количество чисел в массиве ${arrayInt.contentToString()} между двумя нолями = $countBetween")

    println("2.")
    val words = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    var inputStr = ""
    do {
        println("Введите строку для поиска или пусто для выхода:")
        inputStr = readln()
        if (inputStr.isEmpty())
            break;
        val founded = words.filter { it.contains(inputStr, true) }
        if ( founded.isNotEmpty() ){
            println("Найдено: ${founded.toString()}")
        }
        else
        {
            println("Совпадения со строкой '$inputStr' не найдены")
        }
    } while (inputStr.isNotEmpty())


}