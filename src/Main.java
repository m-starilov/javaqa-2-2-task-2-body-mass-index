public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float BMI = service.calculate(87, 191);
        System.out.println("Ваш индекс массы тела: " + BMI);
    }
}
