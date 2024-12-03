import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**TODO
         1. Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}. Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66.
         2. Дан произвольный массив чисел с плавающей точкой. Необходимо отсортировать его по убыванию.
         3. Дан массив целых чисел int[] array = {6, 117, 44, 5, 32, 81, 9}. Необходимо вывести в консоль четные элементы массива.
         */

        {
            //  1.
            int[] array = {3, 87, 12, 98, 2, 4, 66};
            for (int i = array.length - 1; i >= 0; i--)
                System.out.println(String.format("array[%d] = %d", i, array[i]));
        }
        {
            //  2.
            double[] array = {16.5, 4.3, 8.4, 2.1, 6.7, 24.2, 90, 9};
            double temp = 0;
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                };
                System.out.println(String.format("array[%d] = %8.2f", i, array[i]));
            }
        }
        {
            //  3.
            int[] array = {6, 117, 44, 5, 32, 81, 9};
            for (int i = 0; i < array.length; i++)
                if (array[i] % 2 == 0)
                    System.out.println(String.format("array[%d] = %d", i, array[i]));
        }
    }
}