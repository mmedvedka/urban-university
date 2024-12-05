public class Gamer {
    private String nickname;
    private boolean isActive;

    public Gamer (String nickname, boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname () {
        return this.nickname;
    }

    public void setNickname (String nickname) {
        this.nickname = nickname;
    }

    public boolean getIsActive () {
        return this.isActive;
    }
    public void setIsActive (boolean isActive) {
        this.isActive = isActive;
    }

    public static Gamer[] initializeGamers() {
        Gamer[] gamers = new Gamer[5];
        gamers[0] = new Gamer("mikle", true);
        gamers[1] = new Gamer("alex", true);
        gamers[2] = new Gamer("fedor", false);
        gamers[3] = new Gamer("mucha", true);
        gamers[4] = new Gamer("petruha", false);
        return  gamers;
    }
}
