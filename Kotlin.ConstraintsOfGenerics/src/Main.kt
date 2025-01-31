fun main() {
/**TODO
1. Создать обобщенный класс States, который содержит функцию getAverage(), возвращающую среднее значение массива чисел.
   Класс имеет ограничение, работать может только с числовыми значениями, T:Number.
2. Создать класс по имени GenericMethod и обобщенную функцию внутри класса по имени isItIncluded().
   Функция isItIncluded() определяет, является ли объект членом массива.
   Он может быть использован с любым типом объектов и массивов до тех пор, пока массив содержит объекты, совместимые с типом искомого объекта.
*/
    println("1.")
    val array = arrayOf (1,2,3,4,5,6,7,8,9)
    val agvStates = States<Int>(array)
    val avgRes = agvStates.getAverage()
    println("Среднее значение = $avgRes")

    val arrayTwo = arrayOf (13.0,14.0,15.0,17.0,18.0,19.0,20.0,21.0)
    val agvStatesTwo = States<Double>(arrayTwo)
    val avgResTwo = agvStatesTwo.getAverage()
    println("Среднее значение = $avgResTwo")

    println("2.")
    val method = GenericMethod()
    val arrayInt = arrayOf(1,2,3,4,5,6,7,8)
    val arrayDouble = arrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    val arrayString = arrayOf("Иван","Михаил","Мария","Татьяна")

    println("5 является членом массива = ${method.isItIncluded(5,arrayInt)}")
    println("9 является членом массива = ${method.isItIncluded(9,arrayInt)}")

    println("3.0 является членом массива = ${method.isItIncluded(3.0,arrayDouble)}")
    println("10.0 является членом массива = ${method.isItIncluded(10.0,arrayDouble)}")

    println("\'Михаил\' является членом массива = ${method.isItIncluded("Михаил",arrayString)}")
    println("\'Дарья\' является членом массива = ${method.isItIncluded("Дарья",arrayString)}")
}

class States<T>(val array: Array<T>) where  T: Number {
    fun getAverage() : Double {
        var sum = 0.0
        if (array.isEmpty())
            return 0.0
        else
        {
            array.forEach { sum += it.toDouble() }
            return sum / array.size
        }
    }
}

class GenericMethod {
    fun <T> isItIncluded(num: T, array: Array<T>) : Boolean {
        return array.contains(num)
    }
}