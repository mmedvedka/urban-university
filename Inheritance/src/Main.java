//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Footballer gamerMessi = new Footballer("Месси", "Интер-Майами", 37, 5);
        Footballer gamerRonaldu = new Footballer("Роналду", "Ан-Наср", 39, 3);

        HockeyPlayer gamerOveckin = new HockeyPlayer("Овечкин", "Вашингтон Кэпиталз", 39, 3);
        HockeyPlayer gamerMalkin = new HockeyPlayer("Малкин", "Питтсбург Пингвинз", 38, 2);

        Skier skierBolshunov = new Skier("Большунов", "Россия", 27, 20);
        Skier skierUstugov = new Skier("Устюгов", "Россия", 32, 25);

        gamerMessi.toScreen();
        gamerMessi.toWin();
        gamerMessi.setScoringGoals(1);
        gamerMessi.toLose();
        gamerMessi.toScreen();
        System.out.println(String.format("Спортивный снаряд %s - %s",gamerMessi.getName(), gamerMessi.getMainFootballEquipment()));

        gamerRonaldu.toScreen();
        gamerRonaldu.toWin();
        gamerRonaldu.setScoringGoals(2);
        gamerRonaldu.toLose();
        gamerRonaldu.toScreen();
        System.out.println(String.format("Спортивный снаряд %s - %s",gamerRonaldu.getName(), gamerRonaldu.getMainFootballEquipment()));

        gamerOveckin.toScreen();
        gamerOveckin.toWin();
        gamerOveckin.setScoringGoals(2);
        gamerOveckin.toLose();
        gamerOveckin.toScreen();
        System.out.println(String.format("Спортивный снаряд %s - %s",gamerOveckin.getName(), gamerOveckin.getMainHockeyEquipment()));

        gamerMalkin.toScreen();
        gamerMalkin.toWin();
        gamerMalkin.setScoringGoals(1);
        gamerMalkin.toLose();
        gamerMalkin.toScreen();
        System.out.println(String.format("Спортивный снаряд %s - %s",gamerMalkin.getName(), gamerMalkin.getMainHockeyEquipment()));

        skierBolshunov.toScreen();
        skierBolshunov.toWin();
        skierBolshunov.setDistance(10);
        skierBolshunov.toLose();
        skierBolshunov.toScreen();
        System.out.println(String.format("Спортивный снаряд %s - %s",skierBolshunov.getName(), skierBolshunov.getMainSkiEquipment()));

        skierUstugov.toScreen();
        skierUstugov.toWin();
        skierUstugov.setDistance(15);
        skierUstugov.toLose();
        skierUstugov.toScreen();
        System.out.println(String.format("Спортивный снаряд %s - %s",skierUstugov.getName(), skierUstugov.getMainSkiEquipment()));

    }
}