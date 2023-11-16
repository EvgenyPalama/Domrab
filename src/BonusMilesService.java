public class BonusMilesService {
    public int calculate(int price){

        int bonusScale = 20;
        int uploadVolume = 10000;
        int bonus;

        if (uploadVolume >= 1000){
            bonus = uploadVolume / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount =uploadVolume + bonus;


        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");
        return bonus;
    }


}