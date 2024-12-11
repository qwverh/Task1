package module;

public class Car extends Transport{
    private int numberOfDoors;

    public Car() {}

    public Car(String model, String year, int maxSpeed, int numberOfDoors) {
        super(model, year, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors " + numberOfDoors);
    }
}
