public class BmiService {
    public int calculate(int weightKg,  double heightMeters) {
        return (int)  (weightKg / Math.pow(heightMeters, 2));

    }

}
