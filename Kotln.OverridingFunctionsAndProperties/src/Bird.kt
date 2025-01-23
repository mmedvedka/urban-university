open class Bird(val name: String, val type: String) {
    open val isCanFly: Boolean = true
    open val isCanSwim: Boolean = false
    open val isCanDive: Boolean = false

    open fun getInfo(): String {
        var result = "$name $type - "
        if (isCanFly)
            result += "умеет летать\t"
        else
            result += "не умеет летать\t"
        if (isCanSwim)
            result += "умеет плавать\t"
        else
            result += "не умеет плавать\t"
        if (isCanDive)
            result += "умеет нырять\t"
        else
            result += "не умеет нырять\t"
        return result
    }
}

class Duck: Bird("Утка","Водоплавающая"){
    override var isCanFly: Boolean = true
    override var isCanSwim: Boolean = true
    override var isCanDive: Boolean = true

    fun toQuacks() : String {
        return "Кря-кря"
    }

    override fun getInfo(): String {
        return super.getInfo()+" говорит ${toQuacks()}"
    }
}

class Crow: Bird("Ворона","Врановая"){
    override var isCanFly: Boolean = true
    override var isCanSwim: Boolean = false
    override var isCanDive: Boolean = false

    fun toСroak() : String {
        return "Кар-кар"
    }

    override fun getInfo(): String {
        return super.getInfo()+" говорит ${toСroak()}"
    }
}

class Ostrich: Bird("Страус","Нелетающая"){
    override var isCanFly: Boolean = false
    override var isCanSwim: Boolean = false
    override var isCanDive: Boolean = false

    fun toRun() : String {
        return "Очень быстро бегает"
    }

    override fun getInfo(): String {
        return super.getInfo() + toRun()
    }
}