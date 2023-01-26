public class BodyMassIndex {


    public double calculate(double height, double weight) {
        double index = 0;
        double heightSecond = Math.pow(height, 2);
        {
            index = heightSecond * weight;

        }
        return  index;
    }
}