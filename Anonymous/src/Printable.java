
@FunctionalInterface
public interface Printable {
    public void print();

    public default void print(String msg) {
        System.out.println(msg);
    }
}
