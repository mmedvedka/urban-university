class Pet {
    var family: String = "коровы"
    var name: String = "Глаша"
    var weight: Int = 300

    fun getInfo(){
        fun getFamily(): String{
            val result =
            when (weight){
                in (1..5) -> "гуси"
                in (5..20) -> "кошки"
                in (20..100) -> "собаки"
                in (100..500) -> "коровы"
                in (500..3000) -> "слоны"
                else -> "остальные"
            }
            return result
        }
        println(" Домашнее животное: ${getFamily()}\n Кличка: $name\n Вес: $weight\n")

    }
}

