//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**TODO
         1. Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}. Получите массив символов этих строк: char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'}.
         2. Дана строка: String stroke = "12345". Выведите в консоль значение, которое можно, взяв первый и последний символ этой строки в следующем виде. Т.е. "15".
         3. Дана некоторая строка - "1203405". Найдите позицию первого нуля в строке. Т.е. позиция первого нуля в этой строке равна 2.
         */
        {
            //  1.
            String[] stringArray = {"ab", "cd", "ef"};
            int charCount = 0;
            char[] charArray = null;
            String stringOne = "";

            for (int i = 0; i < stringArray.length; i++) {
                stringOne = stringOne + stringArray[i];
            }
            charCount = stringOne.length();
            charArray = new char[charCount];
            stringOne.getChars(0, charCount, charArray, 0);
            System.out.print("Array of char = ");
            System.out.println(charArray);
        }
        {
            //  2.
            String stroke = "12345";
            String newStroke = "";
            newStroke = newStroke+stroke.charAt(0)+stroke.charAt(stroke.length()-1);
            System.out.print("First char + last char = ");
            System.out.println(newStroke);
        }
        {
            //  3.
            String stroke = "1203405";
            System.out.print("Position of first '0' = ");
            System.out.println(stroke.indexOf("0"));
        }
    }
}