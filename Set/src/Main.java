import java.util.*;

public class Main {
    public static HashSet<String> GetCommonElements (HashSet<String> set1, HashSet<String> set2){
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {
        /*
            1.Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
              Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
            2.Создайте множество целых чисел. Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными.
              Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2.
         */
        {
            //  1.
            System.out.println("1.");
            HashSet<String> set1 = new HashSet<String>();
            HashSet<String> set2 = new HashSet<String>();

            String[] colorNames1 = {"red", "blue", "green", "orange", "black"};
            String[] colorNames2 = {"red", "blue", "green", "pink","white"};

            for(String color: colorNames1){
                set1.add(color);
            }

            for(String color: colorNames2){
                set2.add(color);
            }

            System.out.println("Common elements of set1 and set2: "+GetCommonElements (set1, set2));
        }
        {
            //  2.
            System.out.println("2.");

            Integer[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,22,23,24};
            TreeSet<Integer> setNumbers1 = new TreeSet<>();
            TreeSet<Integer> setNumbers2 = new TreeSet<>();

            for(Integer num: numbers){
                if ((num > 15) && (num % 2 == 0)){
                    setNumbers1.add(num);
                }
            }

            for(Integer num: numbers){
                if (!((num > 15) && (num % 2 == 0))){
                    setNumbers2.add(num / 2);
                }
            }

            System.out.println("больше 15 и являются четными:");
            System.out.println(setNumbers1);

            System.out.println("остальные поделенные на 2:");
            System.out.println(setNumbers2);
         }

    }
}