import java.util.*;

public class Main {
    public static void main(String[] args) {
    /**TODO
        1. Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String. Напишите метод для поиска элемента в списке , содержащем эти цвета. На вход метод принимает параметр поиска. Например, если список содержит «red», «blue», «green» и в аргументы метода передать «red»,
           то метод должен вернуть true, символизируя то, что этот цвет содержится в списке.
        2. Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод, который меняет местами первый и последний элементы этого списка и возвращает этот список в новом виде. Т.е., если создали список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1]
     */
        {
            //  1.
            System.out.println("1.");
            String[] colorNames = {"red", "blue", "green", "white", "black", "yellow"};
            ArrayList<String> colors = new ArrayList<>();
            for (String colorName: colorNames){
                colors.add(colorName);
            }

            System.out.println("Check present color 'gray': " + Tools.CheckPresentElement(colors, "gray"));
            System.out.println("Check present color 'red': " + Tools.CheckPresentElement(colors, "red"));
            System.out.println("Check present color 'yellow': " + Tools.CheckPresentElement(colors, "yellow"));

        }
        {
            //  2.
            System.out.println("2.");
            Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
            LinkedList<Integer> listNums = new LinkedList<>();
            for (Integer number: numbers){
                listNums.add(number);
            }
            System.out.println("LinkedList before reverse: " + listNums);
            System.out.println("LinkedList after reverse (standard): " + Tools.GetReverseList(listNums));
            System.out.println("LinkedList after reverse (custom): " + Tools.GetReverseListCustom(listNums));
        }
    }
}