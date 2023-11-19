public class BonusMilesService {
    public int calculate(int price) {

        int bonusScale = 20;

        int bonus = price / bonusScale;

        return bonus;
    }
}
