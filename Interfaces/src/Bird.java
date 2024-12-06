public class Bird implements Swimmable, Flyable{
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(String.format("Птица %s (%d) умеет плавать", getName(), getAge()));
    }

    @Override
    public void fly() {
        System.out.println(String.format("Птица %s (%d) умеет летать", getName(), getAge()));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
