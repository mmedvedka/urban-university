import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /**TODO
         Необходимо написать программу, которая дописывает файл. Программа предлагает записать данные фразой "Вводите данные для записи".
         После того, как введены данные в консоль (необходимо использовать класс Scanner для ввода данных в консоль),
         программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать.
         Вся работа по заполнению файла ведется в бесконечном цикле.
         Если пользователь введет 0, программа завершается строкой «Файл создан».
        */
        String inputStr = "";
        boolean result = false;
        String fileName = "./myfile.txt";

        Scanner sc = new Scanner(System.in);
        System.out.print("Вводите данные для записи (0 для завершения) : ");
        try {
            File file = new File( fileName );
            FileWriter writer = new FileWriter(file, true);
            writer.flush();
            do {
                inputStr = sc.nextLine();
                result = !inputStr.equals("0");
                if (result) {
                    writer.write(inputStr+"\n");
                    System.out.print("Введите что-нибудь еще : ");
                }
            } while (result);
            writer.close();
            System.out.print(String.format("Файл '%s' создан",file.getName()));
        }
        catch (IOException e){
            System.out.println(String.format("Возникло исключение: %s !",e.getMessage()));
        }
    }
}