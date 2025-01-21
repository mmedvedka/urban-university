fun main() {
/**TODO
1. Написать абстрактный класс Shop(магазин). Написать несколько свойств класса, две абстрактные функции и одну обычную, характеризующих работу магазина.
   Создать два класса наследника магазин Magnit и Pyaterochka.
   Написать реализацию функций.
2. Написать абстрактный класс Person.
   В конструкторе передать несколько свойств, например, имени, фамилии, возраста.
   Написать абстрактные функции, характеризующие деятельность объекта класса и одну или несколько обычных. Создать два класса наследника Student и Employee.
   Написать реализацию функций.
3. Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число).
   Найти длину отрезка в тех величинах, под номером которых они находятся.
*/

    println("1.")
    val magnit = Magnit()
    println(magnit.getInfo())

    val pyaterochka = Pyaterochka()
    println(pyaterochka.getInfo())

    println("2.")
    val student = Student("Иван", "Иванов", 20)
    println(student.getPersonInfo())

    val employee = Employee("Петр", "Петров", 40)
    println(employee.getPersonInfo())

    println("3.")
    var lenMeter: Double = 150.0
    println("Length of Piece (ДМ): ${getPieceLength(1, lenMeter)}")
    println("Length of Piece (КМ): ${getPieceLength(2, lenMeter)}")
    println("Length of Piece (М) : ${getPieceLength(3, lenMeter)}")
    println("Length of Piece (ММ): ${getPieceLength(4, lenMeter)}")
    println("Length of Piece (СМ): ${getPieceLength(5, lenMeter)}")
}

fun getPieceLength(numUnit: Int, lenMeter: Double): Double{
    return when (numUnit){
        1-> lenMeter * 10
        2-> lenMeter / 1000
        3-> lenMeter
        4-> lenMeter * 1000
        5-> lenMeter * 100
        else -> 0.0
    }
}