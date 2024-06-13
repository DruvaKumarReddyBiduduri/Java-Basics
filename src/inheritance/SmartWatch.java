package inheritance;

public class SmartWatch implements FitnessWatch,HealthMonitor{
    @Override
    public void trackSteps() {
        System.out.println("tracking foot steps");
    }

    @Override
    public void measurePulse() {
        System.out.println("Measuring pulse");
    }
}
