package Second_Task;

public class BmiCalc {

    public double calculate(int weightInKillogramms, double heightInMeters) {
        return  weightInKillogramms / (heightInMeters * heightInMeters);
    }
}
