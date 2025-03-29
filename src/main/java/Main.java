public class Main {

    public static  void main(String[]args) {
        BonusService service = new BonusService();
        int bonus = service.calcBonus(5_000, true);
        System.out.println(bonus);
    }
}
