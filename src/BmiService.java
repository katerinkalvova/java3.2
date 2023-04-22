public class BmiService {
    public double calculate(int weight, double height) {
        double calculate = weight / (height * height);
        return calculate;
    }
}
