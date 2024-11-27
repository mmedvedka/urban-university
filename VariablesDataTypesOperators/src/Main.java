public class Main {
    public static void main(String[] args) {
        //  1.
        {
            int i = 15;
            double d = 75.5;
            char c = 'c';
            double result = i + d + (double) c;
            System.out.println("1.");
            System.out.printf(String.format("Value of result = %8.2f !\n", result));
        }
        //  2.
        {
            int a = 5, b = 12;
            boolean check = false;
            System.out.println("2.");
            System.out.printf(String.format("Value of a = %d; value of b = %d\n", a, b));
            check = (a == b);
            System.out.printf(String.format("Value of check(a == b) = %b\n", check));
            check = (a >= b);
            System.out.printf(String.format("Value of check(a >= b) = %b\n", check));
            check = (a <= b);
            System.out.printf(String.format("Value of check(a <= b) = %b\n", check));
        }
        //  3.
        {
            int a = 6;
            a += 6;
            a -= 2;
            a /= 5;
            a *= 7;
            System.out.println("3.");
            System.out.printf(String.format("Value of a = %d \n", a));
        }
    }
}