package module;

public class Track extends Car{
    protected int capacity; // Вместимость грузовика
    public Track() {}

    public Track(String model, String year, int maxSpeed, int numberOfDoors, int capacity, String route) {
        super(model, year, maxSpeed, numberOfDoors);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void Departure() {
        System.out.println("Грузовик " + model + " весом " + capacity);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" вес " + capacity);
    }
}
