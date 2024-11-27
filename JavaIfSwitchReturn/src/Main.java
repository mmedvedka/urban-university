import java.io.Console;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
/*TODO
    1. Даны два числа x и y. Программа должна вывести в консоль «Удачное совпадение», – если оба числа четные, либо оба числа нечетные. Иначе программа ничего не выводит.
    2. В переменной day лежит какое-то число из интервала от 1 до 31. Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
*/
        Console console = System.console();
        int partNum = 2;    //  Change part number
        if (partNum == 1)
        {
            System.out.println("Part 1. Input even and odd values x,y for exit");
            boolean result = false;
            String xInput = "", yInput = "";
            int x = 0;
            int y = 0;
            do {
                x = 0;
                y = 0;
                xInput = "";
                yInput = "";
                System.out.printf("Enter x : ");
                xInput = console.readLine();
                if (!xInput.equals(""))
                    x = Integer.parseInt(xInput);
                System.out.printf("Enter y : ");
                yInput = console.readLine();
                if (!yInput.equals(""))
                    y = Integer.parseInt(yInput);
                result = (x % 2 == 0) && (y % 2 == 0) || (x % 2 != 0) && (y % 2 != 0);
                if (result)
                    System.out.println("«Удачное совпадение»");
                result = (x % 2 == 0) && (y % 2 == 0) || (x % 2 != 0) && (y % 2 != 0);
                if (result)
                    System.out.println(String.format("x = %d(%s); y = %d(%s); «Удачное совпадение»", x, (x % 2 == 0) ? "Четное" : "Нечетное", y, (y % 2 == 0) ? "Четное" : "Нечетное"));
            } while (result);
        }
        else
        {
            System.out.println("Part 2. Input 0 for exit");
            String dayInput = "";
            int day = 0;
            double dayDec = 0;
            long decada = 0;
            do {
                day = 0; decada = 0;
                dayInput = "";
                System.out.printf("Enter day between 1 and 31 : ");
                dayInput = console.readLine();
                if (!dayInput.equals(""))
                {
                    day = Integer.parseInt(dayInput);
                    if (day >= 1 && day <= 31) {
                        dayDec = day / 10.0;
                        decada = (dayDec <= 1.0)? 1: (dayDec <= 2.0)? 2 : 3;
                        System.out.println(String.format("Decada is %d(%f)", decada, dayDec));
                    }
                }
            } while (decada > 0);
        }

    }
}