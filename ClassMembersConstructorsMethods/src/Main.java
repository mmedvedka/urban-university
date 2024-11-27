public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 5);
//       double result;
        System.out.println(String.format("calc: this.a + this.b = %8.2f", calc.add()));
        System.out.println(String.format("calc: this.a + b = %8.2f", calc.add(10)));
        System.out.println(String.format("calc: a + b = %8.2f", calc.add(12, 6)));

        System.out.println(String.format("calc: this.a + this.b = %8.2f", calc.sub()));
        System.out.println(String.format("calc: this.a + b = %8.2f", calc.sub(10)));
        System.out.println(String.format("calc: a + b = %8.2f", calc.sub(12, 6)));

        calc.mult();
        calc.mult(10);
        calc.mult(12, 6);

        calc.div();
        calc.div(10);
        calc.div(12, 6);

    }
}