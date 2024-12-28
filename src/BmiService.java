public class BmiService {
    public int calculate(double heightMetre, double weightKG) {
        double index = (weightKG / (heightMetre * heightMetre));
        return (int) index;

    }
}
