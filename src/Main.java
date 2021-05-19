public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60; // вес в кг
        double height = 1.7; // рост в м
        double bmi = service.calculate(weight , height);
        bmi = Math.round(bmi * 100);  // округлить до 2 знаков
        bmi = bmi/100;
        System.out.println("ИМТ: " + bmi);
    }
}
