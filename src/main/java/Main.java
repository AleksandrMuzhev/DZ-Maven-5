public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonusball = (int) service.calculate(5000, true);
        System.out.println(bonusball);
    }
}
