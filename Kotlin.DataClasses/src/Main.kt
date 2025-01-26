fun main() {
/**TODO
  Написать программу по продаже билетов в кино.
  Пользователь покупает билет, в который заносятся данные названия фильма, места и времени начала сеанса.
  Проданные билеты заносятся в массив архива.
  По желанию можно вывести все проданные билеты на фильм.
 */
/*
    var logTickets = LogTicket()
    logTickets.addTicket(MovieTicket("Остров сокровищ", "12", "2025-01-20 11:00"))
    logTickets.addTicket(MovieTicket("Зорро", "23", "2025-01-21 16:00"))
    logTickets.addTicket(MovieTicket("Маска", "34", "2025-01-22 18:00"))
    logTickets.addTicket(MovieTicket("Маска", "34", "2025-01-22 18:00")) // not affected on operation ==
*/

    val lodTicket = LogTicket()

    println("Заполнить журнал купленных билетов\n1.Да\n2.Нет")
    if (readln() == "1")
      while (true) {
        println("Введите название фильма:")
        val title = readln()
        println("Введите место:")
        val place = readln()
        println("Введите начало сеанса:")
        val start = readln()
        if (!lodTicket.addTicket(MovieTicket(title, place, start))) {
          println("Такой билет уже существует! Хотите продолжить?\n" +
                  "1.Да\n" +
                  "2.Нет")
          if (readln() == "2")
            break
        }
        else {
          println("Билет успешно добавлен! Хотите продолжить?\n" +
                  "1.Да\n" +
                  "2.Нет")
          if (readln() == "2")
            break
        }
      }

      println("Журнал купленных билетов: \n${lodTicket.toString()}")
}