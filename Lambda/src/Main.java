import java.util.ArrayList;

interface Expression {
    public boolean isEven(int a);
};

interface CompareHelper {
    public boolean isCorrected(String s, int len);
};

public class Main {
    public static int GetSumOfEven(int[] array, Expression exp){
        int result = 0;
        for (int item: array){
            if (exp.isEven(item)){
                result += item;
            }
        }
        return result;
    };

    public static String GetLongString(ArrayList<String> list, CompareHelper help){
        int strLen = 0;
        String result = list.get(0);
        for(String str: list){
            if (help.isCorrected(str, result.length())){
                result = str;
            }
        }
        return result;
    };

    public static void main(String[] args) {
/*
    1. Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.
    2. Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке, состоящего из нескольких слов.
 */
        {
            //  1.
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            Expression exp = (a) -> a % 2 == 0;

            System.out.println("1.");
            System.out.println("Sum of even numbers (Variant 1): " + GetSumOfEven(array, exp));
            System.out.println("Sum of even numbers (Variant 2): " + GetSumOfEven(array, (a) -> a % 2 == 0));
        }
        {
            //  2.
            String[] list = {"word", "two words", "one of words", "the galaxy is huge", "thegalaxyishugeoneword"};
            ArrayList<String> stringList = new ArrayList<>();
            for(String str: list){
                stringList.add(str);
            }

            CompareHelper helper = (s, len ) -> {
                String [] arr = s.split(" ");
                if (arr.length > 1 && s.length() > len){
                    return true;
                }
                return false;
            };

            System.out.println("1.");
            System.out.println("The longest word in list (Variant 1): '" + GetLongString(stringList, helper)+"'");
            System.out.println("The longest word in list (Variant 2): '" + GetLongString(stringList,
             (s, len) ->{
                 String [] arr = s.split(" ");
                 if (arr.length > 1 && s.length() > len){
                    return true;
                 }
                 return false;
            }
            )+"'");
        }
    }
}

