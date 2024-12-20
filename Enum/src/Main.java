import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static Integer GetPositionAlpha(String alpha){
        Alphabet[] alphaValues = Alphabet.values();
        String alphas = Arrays.deepToString(alphaValues).replaceAll(", ", "");
        return alphas.indexOf(alpha);
    }

    public static ArrayList<Person> GetGenderList(ArrayList<Person> persons, Person.Gender gender){
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: persons){
            if (person.getGender() == gender){
                result.add(person);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /**TODO
        1. Необходимо написать метод, который возвращает позицию буквы алфавита.
         Для реализации программы создать enum алфавита.
        2. Написать класс Person с полями имени(name), возраста(age).
         Для определения пола Person создать enum Gender с соответствующими константами. В классе с методом main создать список объектов Person, состоящий не менее, чем из 10 человек разного пола. Написать метод, возвращающий список объектов класса Person в зависимости от введенного параметра пола, т.е. список мужчин или женщин.
         */
        {
            //  1.
            System.out.println("1.");
            System.out.println("Position of A: "+GetPositionAlpha("A"));
            System.out.println("Position of B: "+GetPositionAlpha("B"));
            System.out.println("Position of C: "+GetPositionAlpha("C"));
            System.out.println("Position of D: "+GetPositionAlpha("D"));
            System.out.println("Position of E: "+GetPositionAlpha("E"));
            System.out.println("Position of F: "+GetPositionAlpha("F"));

            System.out.println("Position of Y: "+GetPositionAlpha("Y"));
            System.out.println("Position of Z: "+GetPositionAlpha("Z"));
        }

        {
            //  2.
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person("Михаил", 25, Person.Gender.MAN));
            persons.add(new Person("Валентина", 30, Person.Gender.WOMAN));

            persons.add(new Person("Алексей", 35, Person.Gender.MAN));
            persons.add(new Person("Елена", 40, Person.Gender.WOMAN));

            persons.add(new Person("Олег", 45, Person.Gender.MAN));
            persons.add(new Person("Анна", 50, Person.Gender.WOMAN));

            persons.add(new Person("Николай", 55, Person.Gender.MAN));
            persons.add(new Person("Юлия", 60, Person.Gender.WOMAN));

            persons.add(new Person("Александр", 65, Person.Gender.MAN));
            persons.add(new Person("Анастасия", 70, Person.Gender.WOMAN));

            System.out.println("1.");
            System.out.println("List of mans : "+GetGenderList(persons, Person.Gender.MAN));
            System.out.println("List of women : "+GetGenderList(persons, Person.Gender.WOMAN));
        }
    }

    enum Alphabet {
        A("A"), B("B"), C("C"), D("D"), E("E"), F("F"), G("G"), H("H"),
        I("I"), J("J"), K("K"), L("L"), M("M"), N("N"), O("O"), P("P"),
        Q("Q"), R("R"), S("S"), T("T"), U("U"), V("V"), W("W"), X("X"),
        Y("Y"), Z("Z");

        private String name;
        Alphabet(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

}