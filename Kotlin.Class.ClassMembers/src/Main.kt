fun main() {
/**TODO
1. Создать класс вертолет со свойствами название(имя), взлетный вес, скорость полета, максимальная высота полета.
   В классе с методом mainсоздать экземпляр этого класса, например, alligator, свойствам задать конкретные значения.
   Вывести в консоль строку: «Спроектировали вертолет с названием… скоростью полета… весом… высотой полета…»

2. Написать класс домашнее животное. Свойствами класса будут вес, кличка и принадлежность к определённому типу (коровы, гуси, собаки и так далее), нужно их написать в классе.
   В классе с главным методом создайте свое домашнее животное. Выведите в консоль:
   println("Домашнее животное: " + … +
   "Кличка: " + …. +
   "Вес: " + …);
3. Даны переменная с плавающей точкой, равная 5,87. Необходимо привести ее к целочисленному типу
*/
    println("1.")
    val apache = Helicopter()
    apache.getInfo()

    val alligator = Helicopter()
    alligator.name = "Аллигатор"
    alligator.weight = 10800
    alligator.altitude = 5500
    alligator.getInfo()

    println("2.")
    val cow = Pet()
    cow.getInfo()

    val cat = Pet()
    cat.name = "Муська"
    cat.weight = 15
    cat.getInfo()

    val dog = Pet()
    dog.name = "Жучка"
    dog.weight = 25
    dog.getInfo()

    val elephant = Pet()
    elephant.name = "Ушастая гора"
    elephant.weight = 600
    elephant.getInfo()

    println("3.")
    val numDouble = 5.87
    println(" $numDouble convert to Int is ${numDouble.toInt()}")

}