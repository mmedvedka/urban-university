class Human (val name: String, val city: String) {

    override fun toString(): String {
        return "Человек по имени $name живет в городе $city"
    }

    class Head(): BodyPart("голова"), BodyPart.Function {
        private fun toThink(): String {
            return "думать"
        }
        override fun getInfo(): String {
            return "$name - может ${toThink()}"
        }
    }

    class Hands(): BodyPart("руки"), BodyPart.Function {
        private fun toPlayGuitar(): String {
            return "играть на гитаре"
        }

        override fun getInfo(): String {
            return "$name - привыкли ${toPlayGuitar()}"
        }
    }

    class Legs(): BodyPart("ноги"), BodyPart.Function {
        private fun toRun(): String {
            return "бегать"
        }

        private fun toJump(): String {
            return "прыгать"
        }

        override fun getInfo(): String {
            return "$name - могут ${toRun()} и ${toJump()}"
        }
    }

}