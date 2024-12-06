public class Sportsman {
    private String name;
    private String team;
    private int age;
    private String sport;

    public Sportsman (String name, String team, int age, String sport) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.sport = sport;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getTeam () {
        return this.team;
    }

    public void setTeam (String team) {
        this.team = team;
    }

    public int getAge () {
        return this.age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getSport() {
        if (sport.isEmpty())
                return "Спортсмен";
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getInfo (){
        return String.format("%s %s: команда - %s; возраст - %d ", getSport(), getName(), getTeam(), getAge());
    }

    public void toScreen() {
        System.out.println(getInfo ());
    }

    public void toWin() {
        System.out.println(getInfo () + " одержал победу");
    }

    public void toLose() {
        System.out.println(getInfo () + " потерпел поражение");
    }

}
