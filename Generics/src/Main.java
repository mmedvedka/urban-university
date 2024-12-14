
public class Main {
    public static void main(String[] args) {
        /**TODO
         1.Напишите метод, который принимает два массива одного типа и проверяет, содержат ли они одинаковые элементы в одном и том же порядке.
         2.Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
         */
        {
            //  1.
            boolean result;
            Integer[] array1 = {1, 4, 9, 10, 3, 5, 7, 9, 11};
            Integer[] array2 = {1, 4, 9, 10, 3, 5, 7, 9};

            result = Tools.<Integer>CheckTheSameValuesAndOrders(array1, array2);
            System.out.println("Result of SameValuesAndOrders for Integer: " + result);

            Double[] darray1 = {1.1, 4.2, 9.3, 10.4, 11.5, 12.6, 13.7, 14.8};
            Double[] darray2 = {1.1, 4.2, 9.3, 10.4, 11.5, 12.6, 13.7, 14.8};

            result = Tools.<Double>CheckTheSameValuesAndOrders(darray1, darray2);
            System.out.println("Result of SameValuesAndOrders for Double: " + result);
        }

        {
            //  2.
            String[] words = {"One", "Two", "Three", "Four", "Five", "Six"};
            System.out.println("Before string array exchange");
            for (String word : words) {
                System.out.println(word);
            }

            Tools.<String>ExchangePositions(words, 1, 3);

            System.out.println("After string array exchange");
            for (String word : words) {
                System.out.println(word);
            }

            Double[] numbers = {1.1, 4.2, 9.3, 10.4, 11.5, 12.6, 13.7, 14.8};
            System.out.println("Before double array exchange");
            for (Double number : numbers) {
                System.out.println(number);
            }

            Tools.<Double>ExchangePositions(numbers, 1, 3);

            System.out.println("After double array exchange");
            for (Double number : numbers) {
                System.out.println(number);
            }
        }
    }
}