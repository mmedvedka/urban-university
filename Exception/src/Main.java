public class Main {

    public static void checkDigitInString (String value) throws Exception{
        for (char c : value.toCharArray()) {
            if (Character.isDigit(c))
                throw new Exception(String.format("Исключение: Строка %s содержит цифры!", value));
        }
//        System.out.println(String.format("Строка %s не содержит цифры!", value));
    }

    public static void checkEvenValue (int value) throws Exception{
        if (value % 2 != 0)
            throw new Exception(String.format("Исключение: Число %d нечетное!", value));
 //       else
 //           System.out.println(String.format("Число %d четное!", value));
    }

    public static void main(String[] args) {
        /**TODO
         1. Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное. Необходимо протестировать ее в методе main с разными числами.
         2. ***Напишите метод, который принимает строку в качестве входных данных и выдает исключение, если строка содержит числа.
          */
        {
            //  1.
            for (int i = 1; i <= 10; i++)
            try {
                checkEvenValue (i);
                System.out.println(String.format("Число %d четное!", i));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        {
            String[] words = {"Exception", "Exc01eption", "02Exception", "NoException","Exception 03"};
            for (String word: words)
                try {
                    checkDigitInString (word);
                    System.out.println(String.format("Строка %s не содержит цифры!", word));
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }

    }
}