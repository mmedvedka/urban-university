class CheckWordImpl (val word: String): CheckWord {
    override fun isChecked(): Boolean {
        return word == word.reversed()
    }

    override fun toString(): String {
        if (isChecked())
            return "Слово $word является полиндромом"
        else
            return "Слово $word НЕ является полиндромом"
    }
}

interface CheckWord {
    fun isChecked(): Boolean
    override fun toString(): String
}

class Polindrom(checkword: CheckWord) : CheckWord by checkword