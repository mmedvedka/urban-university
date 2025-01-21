fun main() {
/**TODO
1. Написать абстрактный класс «Службы экстренного реагирования».
  У него есть свой конструктор, содержащий свойства name и phone.
  Он содержит функцию, характеризующий его деятельность.
  Напишите интерфейс, который содержит функцию getDescription, дающую описание той или ной службы или организации.
2. Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД),
  используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
3. Дан набор целых чисел. Найти второе максимальное число.
*/

    println("1.")
    var svcMedical = MedicalService()
    println("${svcMedical.getDescription()}")

    var svcFire = FireService()
    println("${svcFire.getDescription()}")

    println("2.")
    var a = 96; var b = 36
    println("Наибольший общий делитель $a и $b = ${calculateNOD(a, b)}")

    a = 75; b = 45
    println("Наибольший общий делитель $a и $b = ${calculateNOD(a, b)}")

    println("3.")
    val setInt =  setOf(11, 2, 13, 4, 15, 6, 17, 8, 14, 3, 20)
    val set = setInt.sortedDescending()
    println("Второе максимально число = ${set.elementAt(1).toInt()} для ${set.toIntArray().contentToString()}")
}

fun calculateNOD(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}
