fun main() {
/**TODO
1. Создать суперкласс Animal(животное) со свойствами веса и имени.
   Написать функцию, которая описывает прием пищи животного.
   Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса.
   У каждого животного определить по одной своейфункции.
2. Создать классы Nokia и Sony. Наследовать каждый из них от суперклассов Smartphone и IPhone.
   Создать несколько свойств в суперклассах и функцию звонка.
3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23.
   Вывести на экран элементы массива, которые делятся на 5 на цело.
*/
    println("1.")
    val dog = Dog("Жучка", 15)
    println(dog.toString())
    dog.barking()

    val cat = Cat("Муська", 7)
    println(cat.toString())
    cat.meows()

    println("2.")
    val smart = Smartphone("Smartphone", 100, 50, "Red")
    println(smart.toString())
    smart.makeCall()

    val iphone = IPhone()
    println(iphone.toString())
    iphone.makeCall()
    iphone.takePhoto()

    val sony = Sony()
    println(sony.toString())
    sony.makeCall()
    sony.playMusic()

    val nokia = Nokia()
    println(nokia.toString())
    nokia.makeCall()
    nokia.playGame()

    println("3.")
    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    println("Numbers even for 5: ")
    for (i in array){
        if (i % 5 == 0)
            print("$i\t")
    }
    println()
}