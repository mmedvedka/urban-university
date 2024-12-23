public class Main {
    public static void main(String[] args) {
/**TODO
    1. Написать функциональный интерфейс Printable с методом print().
       В классе с методом main создать несколько анонимных классов с различными реализациями метода print().
    2.  Написать функциональный интерфейс Concationble с методом concat(), который объединяет две строковых переменных, передаваемых в параметры метода и возвращает строку.
       В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().
 */
        {
            //  1.
            Printable printFirst = new Printable() {
                @Override
                public void print() {
                    print("First anonymous class for default method 'print'");
                }
            };

            Printable printSecond = new Printable() {
                @Override
                public void print() {
                    System.out.println("Second anonymous class for method 'print'");
                }
            };

            System.out.println("1.");
            printFirst.print();
            printFirst.print("Using default method print(String msg) of interface Printable");
            printSecond.print();
        }
        {
            //  2.
            Concationble concatFirst = new Concationble() {
                @Override
                public String concat(String str1, String str2) {
                    return str1 + str2;
                }
            };

            Concationble concatSecond = new Concationble() {
                @Override
                public String concat(String str1, String str2) {
                    return str1.concat(str2);
                }
            };

            Concationble concatThird = new Concationble() {
                @Override
                public String concat(String str1, String str2) {
                    return String.format("%s%s",str1, str2);
                }
            };

            Concationble concatFourth = new Concationble() {
                @Override
                public String concat(String str1, String str2) {
                    String[] strings = {str1, str2};
                    return String.join("", strings);
                }
            };

            System.out.println("2.");
            System.out.println("Concat First(+): "+concatFirst.concat("[ string one ]", "[ string two ]"));
            System.out.println("Concat Second(String.concat): "+concatSecond.concat("[ one string ]", "[ two string ]"));
            System.out.println("Concat Third (String.format): "+concatThird.concat("[ one string ]", "[ two string ]"));
            System.out.println("Concat Fourth (String.join): "+concatFourth.concat("[ one string ]", "[ two string ]"));
        }
    }
}