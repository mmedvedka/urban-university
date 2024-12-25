import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
/**TODO
 1. Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
 2. Дана строка "Привет, Александр, с праздником, с Новым Годом".
    Написать программу, которая поменяет регистр символов.
    Т.е. результат должен быть таким: пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ.
 */
        {
            //  1.
            System.out.println("1.");
            int evenMax = 0;

            //  Variant 1
            List<Integer> numbers =  Arrays.asList (1,2,3,4,14,5,36,7,15,8,9,10,11,16);
            evenMax = numbers.stream().filter(i -> i % 2 == 0).mapToInt((i) -> i).max().orElse(0);
            System.out.println("Variant 1:");
            System.out.printf("Max of even numbers: %d\n", evenMax);

            //  Variant 2 (without even numbers)
            int[] nums =  new int[] {1,3,5,15,9,7,11};
            evenMax = Arrays.stream(nums).filter(i -> i % 2 == 0).max().orElse(0);
            System.out.println("Variant 2 (without even numbers):");
            System.out.printf("Max of even numbers: %d\n", evenMax);
        }
        {
            //  2.
            String result = "";
            String str = "Привет, Александр, с праздником, с Новым Годом";
            char[] chars = str.toCharArray();

            //  Variant 1.
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                result += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
            }
            System.out.println("Variant 1:");
            System.out.printf("Changed string is : %s\n", result);

            //  Variant 2.
            result = str
                .chars()
                .map(s -> Character.isUpperCase(s) ? Character.toLowerCase(s) : Character.toUpperCase(s))
                .mapToObj(s -> (char) s)
                .map(Object::toString)
                .collect(joining());
            System.out.println("Variant 2:");
            System.out.printf("Changed string is : %s\n", result);
        }
    }
}