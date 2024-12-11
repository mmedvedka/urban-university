public class Footballer extends SportsmanGoals{

    public String getMainFootballEquipment(){
        return "Футбольный мяч";
    }

    public Footballer(String name, String team, int age, int scoreGoals) {
        super(name, team, age, "Футболист", scoreGoals);
    }
}
