package module;

public class Track extends Car{
    protected int capacity; // Вместимость грузовика
    protected String route; // Маршрут грузовика
    public Track() {}

    public Track(String model, String year, int maxSpeed, int numberOfDoors, int capacity, String route) {
        super(model, year, maxSpeed, numberOfDoors);
        this.capacity = capacity;
        this.route = route;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    public String getRoute() {
        return route;
    }
    public void Departure() {
        System.out.println("Грузовик " + model + " весом " + capacity + " выполняет маршрут " + route);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" вес " + capacity + " маршрут " + route);
    }
}
