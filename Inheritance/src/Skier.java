public class Skier extends Sportsman{
    private int distance;

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public Skier(String name, String team, int age, int distance) {
        super(name, team, age, "Лыжник");
        this.distance = distance;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" дистанция - %d ", getDistance());
    }

}
