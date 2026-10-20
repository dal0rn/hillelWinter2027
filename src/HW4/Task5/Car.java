package HW4.Task5;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

        System.out.println("Car ready to start!");
    }
    private void startElectricity() {
        System.out.println("Starting Electricity");
    }
    private void startCommand () {
        System.out.println("Starting Command");
    }
    private void startFuelSystem() {
        System.out.println("Starting Fuel System");
    }
}
