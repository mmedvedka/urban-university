import java.util.*;
import java.util.stream.Stream;

class PersonComparator implements Comparator<Person>{
    public int compare(Person p1, Person p2){
        return p1.getAge().compareTo(p2.getAge());
    }
}

public class Main {
    public static void main(String[] args) {
/*
        1. Создайте список типа String, например, названия пищевых продуктов. Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы, с использованием потоков.
        2. Создать класс Person с полями name и age. В классе с методом main создать список, состоящий не менее, чем из 10 объектов класса Person с произвольными данными.
        Отфильтровать и вывести в консоль объекты Person, возраст которых более 30 лет.
 */
        {
            //  1.
            List<String> products = Arrays.asList("Хлеб", "Масло", "Молоко", "Рыба", "Говядина", "Свинина", "Греча", "Сосиски", "Колбаса", "Сыр", "Творог", "Сметана");

            System.out.println("1.");
            final String startSymb1 = "М";
            System.out.printf("Count of products, that starts with '%s' : %d \n",
                    startSymb1,
                products.stream()
                    .filter(p -> p.startsWith(startSymb1))
                    .count()
            );

            final String startSymb2 = "С";
            System.out.printf("Count of products, that starts with '%s' : %d \n",
                    startSymb2,
                    products.stream()
                            .filter(p -> p.startsWith(startSymb2))
                            .count()
            );
        }
        {
            //  2.
            Stream<Person> persons = Stream.of(
                    new Person("Михаил", 30),
                    new Person("Иван", 25),
                    new Person("Федор", 37),
                    new Person("Анна", 28),
                    new Person("Александр", 36),
                    new Person("Екатерина", 40),
                    new Person("Николай", 55),
                    new Person("Анатолий", 29),
                    new Person("Юлия", 56),
                    new Person("Татьяна", 29),
                    new Person("Сергей", 31)
            );

            System.out.println("2.");
            System.out.println("All persons with age > 30: ");
            persons
               .sorted(new PersonComparator())
               .filter(p -> (p.getAge() > 30))
               .forEach(p -> System.out.printf("\t%s\t(%d)\n",p.getName(), p.getAge()));
        }
    }
}

