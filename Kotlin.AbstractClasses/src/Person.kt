abstract class Person(val name: String, val family: String, val age: Int) {
    var persName = name
    var persFamily = family
    var persAge = age
    abstract fun getResponsibility(): String
    abstract fun getPost(): String

    open fun getPersonInfo(): String {
        return "Name of person: $persFamily $persName, age: $persAge; responsibility: ${getResponsibility()}; post: ${getPost()}"
    }
}

class Student(name: String, family: String, age: Int): Person(name, family, age){
    override fun getResponsibility(): String {
        return "Обучение"
    }
    override fun getPost(): String{
        return "Студент"
    }
}

class Employee(name: String, family: String, age: Int): Person(name, family, age){
    override fun getResponsibility(): String {
        return "Руководство"
    }
    override fun getPost(): String{
        return "Директор"
    }
}