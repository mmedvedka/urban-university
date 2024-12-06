public class SportsmanGoals extends Sportsman{
    private int scoringGoals;

    public SportsmanGoals(String name, String team, int age, String sport, int scoringGoals) {
        super(name, team, age, sport);
        this.scoringGoals = scoringGoals;
    }

    public int getScoringGoals() {
        return scoringGoals;
    }

    public void setScoringGoals(int scoringGoals) {
        this.scoringGoals = scoringGoals;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" забил - %d ", getScoringGoals());
    }
}
