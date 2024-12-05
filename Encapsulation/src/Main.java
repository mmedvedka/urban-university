//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**TODO
         1. Создать класс Gamer с полем private строкового типа nickname и полем private логического типа isActive, оно характеризует в игре сейчас объект класса или нет, т.е. true или false соответственно. Создать конструктор этого класса и методы доступа к полям класса.
         2. Создать массив объектов класса Gamer и включить в него не менее пяти объектов класса Gamer с разными nickname и isActive (например, двое будут в игре, т.е. true, двое - нет).
         3. Вывести в консоль имена игроков, которые находятся в игре.
         */
        Gamer[] gamers = Gamer.initializeGamers();
        for (int i = 0; i < gamers.length; i++) {
            if (gamers[i].getIsActive()) {
                System.out.print("nickname = ");
                System.out.println(gamers[i].getNickname());
            }
        }
    }
}