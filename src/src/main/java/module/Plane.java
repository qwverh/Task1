package module;

public class Plane extends Transport {
    protected String route; // Выполняемый маршрут;

    public Plane() {}

    public Plane(String model, String year, int maxSpeed, String route) {
        super(model, year, maxSpeed);
        this.route = route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
    public String getRoute() {
        return route;
    }
    public void flight() {
        System.out.println("Самолет " + model + " выполняет рейс " + route);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Рейс " + route);
    }
}
