import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
/**TODO
    1. Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.
    2. Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков.
 */
        {
            //  1.
            System.out.println("1.");
            List<Integer> numbers =  Arrays.asList (1,2,3,4,5,6,7,8,9,10,11,12,13,14);
            //  Variant 1
            Map<Boolean, Integer> mapSum =
                    numbers.stream().collect(
                            Collectors.partitioningBy(x -> x % 2 == 0, Collectors.summingInt(Integer::intValue))
                    );
            System.out.println("Variant 1:");
            System.out.printf("Sum of even numbers: %d\n", mapSum.get(true));
            System.out.printf("Sum of odd numbers: %d\n", mapSum.get(false));

            //  Variant 2
            int evenSum = numbers.stream().filter(i -> i % 2 == 0).mapToInt((i) -> i).sum();
            int oddSum = numbers.stream().filter(i -> i % 2 != 0).mapToInt((i) -> i).sum();
            System.out.println("Variant 2:");
            System.out.printf("Sum of even numbers: %d\n", evenSum);
            System.out.printf("Sum of odd numbers: %d\n", oddSum);
        }
        {
            //  2.
            System.out.println("2.");
            List<Integer> list = List.of(1, 2, 3, 9, 4, 3, 2, 1, 4, 7, 8, 9);
            List<Integer> distinctInts = list.stream().distinct().collect(Collectors.toList());
            System.out.println(distinctInts);
        }
    }
}