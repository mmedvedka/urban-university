public class Calculator {
    private double a;
    private double b;

    public Calculator ( double a, double b ) {
        this.a = a;
        this.b = b;
    }

    public Calculator ( ) {
        this.a = 0.0;
        this.b = 0.0;
    }

    public double getA( ) {
        return a;
    }

    public double getB( ) {
        return b;
    }

    public void setA ( double value ) {
        this.a = value;
    }

    public void setB ( double value ) {
        this.b = value;
    }

    public double add ( )
    {
        return this.a + this.b;
    }

    public double add ( double b )
    {
        return this.a + b;
    }

    public double add ( double a, double b )
    {
        return a + b;
    }

    public double sub ( )
    {
        return this.a - this.b;
    }

    public double sub ( double b )
    {
        return this.a - b;
    }

    public double sub ( double a, double b )
    {
        return a - b;
    }

    public void mult () {
        System.out.println(String.format("this.a * this.b = %f", this.a * this.b));
    }

    public void mult (double b) {
        System.out.println(String.format("this.a * b = %8.2f", this.a * b));
    }

    public void mult (double a, double b) {
        System.out.println(String.format("a * b = %8.2f", a * b));
    }

    public void div () {
        System.out.println(String.format("this.a / this.b = %8.2f", this.b != 0? this.a / this.b: 0.0));
    }

    public void div (double b) {
        System.out.println(String.format("this.ggita * b = %8.2f", b != 0? this.a / b: 0.0));
    }

    public void div (double a, double b) {
        System.out.println(String.format("a * b = %8.2f", b != 0? a / b: 0.0));
    }
}
