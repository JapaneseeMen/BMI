public class Main {

    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double index = service.calculate(1.6, 80);
        System.out.println("Индекс массы тела: " + index);
    }
}