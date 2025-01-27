enum class Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

class Seasons {
    private val months = arrayOf("ЯНВАРЬ", "ФЕВРАЛЬ", "МАРТ", "АПРЕЛЬ", "МАЙ", "ИЮНЬ", "ИЮЛЬ", "АВГУСТ", "СЕНТЯБРЬ", "ОКТЯБРЬ", "НОЯБРЬ", "ДЕКАБРЬ")
    private fun getMonthFromStringRUS(monthName: String): Month {
        val result =
        when (monthName.uppercase()) {
            months[0] -> Month.JANUARY
            months[1] -> Month.FEBRUARY
            months[2] -> Month.MARCH
            months[3] -> Month.APRIL
            months[4] -> Month.MAY
            months[5] -> Month.JUNE
            months[6] -> Month.JULY
            months[7] -> Month.AUGUST
            months[8] -> Month.SEPTEMBER
            months[9] -> Month.OCTOBER
            months[10] -> Month.NOVEMBER
            months[11] -> Month.DECEMBER
            else -> Month.JANUARY
        }
        return result
    }

    private fun getSeasonNameRUS(season: Season): String {
        val result =
        when (season) {
           Season.WINTER -> "ЗИМА"
           Season.SPRING -> "ВЕСНА"
           Season.SUMMER -> "ЛЕТО"
           Season.AUTUMN -> "ОСЕНЬ"
        }
        return result
    }

    private fun getSeason(month: Month): Season {
        return when (month) {
            Month.DECEMBER, Month.JANUARY, Month.FEBRUARY -> Season.WINTER
            Month.MARCH, Month.APRIL, Month.MAY -> Season.SPRING
            Month.JUNE, Month.JULY, Month.AUGUST -> Season.SUMMER
            Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> Season.AUTUMN
        }
    }

    private fun checkMonthName(monthName: String): Boolean {
       if ( months.contains(monthName.uppercase()) )
          return true
       else
          return false
    }

    fun getSeasonName(monthName: String): String {
        if (checkMonthName(monthName))
            return  "$monthName -> ${getSeasonNameRUS(getSeason(getMonthFromStringRUS(monthName)))}"
        else
            return "Неправильно введен месяц: $monthName"
    }
}