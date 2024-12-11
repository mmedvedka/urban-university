public class HockeyPlayer extends SportsmanGoals {
    public String getMainHockeyEquipment(){
        return "Хоккейная шайба";
    }

    public HockeyPlayer(String name, String team, int age, int scoreGoals) {
        super(name, team, age, "Хоккеист", scoreGoals);
    }
}
