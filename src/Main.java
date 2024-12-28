public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weightKG = 95;
        double heightMetre = 1.71;

        int index = service.calculate(heightMetre, weightKG);
        System.out.println(index);
    }
}