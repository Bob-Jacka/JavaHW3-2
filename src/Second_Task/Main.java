package Second_Task;

public class Main {
    public static void main(String[] args) {
        int weightInKillogramms = 98;
        double heightInMeters = 1.87;
        BmiCalc service = new BmiCalc();

        System.out.println( "BMI is " + (int)service.calculate(weightInKillogramms, heightInMeters));
    }
}
