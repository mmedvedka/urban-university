//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**TODO
        1. Создать классы Human, Fish, Bird с полями имени, возраста (можно добавить любые поля по своему усмотрению).
        2. Создать интерфейс Swimmable с методом, описывающим возможность плавать – swim. Созданные выше классы должны наследоваться от этого интерфейса, реализация метода у каждого класса будет своя, например, у человека – умеет плавать техникой брасс.
        3. Создать интерфейс Flyable с методом fly. Наследовать от этого интерфейса те классы, которые могут в той или иной мере выполнять полет. В классе с методом main создать экземпляры классов Human, Fish, Bird, вызвать у этих экземпляров имеющиеся методы
        */
        Human manMikle = new Human("Михаил", 50);
        Bird birdВuck = new Bird("Утка", 5);
        Fish fishPike = new Fish("Щука", 10);

        manMikle.swim();
        manMikle.fly();

        birdВuck.swim();
        birdВuck.fly();

        fishPike.swim();

    }
}