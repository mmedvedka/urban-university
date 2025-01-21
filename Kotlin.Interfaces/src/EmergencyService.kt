abstract class EmergencyService(val name: String, val phone: String) {
    var svcName = name
    var svcPhone = phone
    abstract fun getTypeActivity(): String
}

interface Description{
    fun getDescription(): String
}

class MedicalService():
    EmergencyService("Медицинская служба", "103"),
    Description{
        override fun getTypeActivity(): String{
            return "Оказание медицинской помощи"
        }

        override fun getDescription(): String {
            return "$name осуществляет ${getTypeActivity()} "
        }
}

class FireService():
    EmergencyService("Пожарная служба", "101"),
    Description{
    override fun getTypeActivity(): String{
        return "Тушение пожаров"
    }

    override fun getDescription(): String {
        return "$name осуществляет ${getTypeActivity()} и их предупреждение"
    }
}