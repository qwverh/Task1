package module;

public class Boat extends Transport {
    private String type; // Тип лодки (например, моторная, парусная)
    private boolean hasLifeJackets; // Есть ли спасательные жилеты

    public Boat(String model, String year, int maxSpeed, String type, boolean hasLifeJackets) {
        super(model, year, maxSpeed);
        this.type = type;
        this.hasLifeJackets = hasLifeJackets;
    }

    public void sail() {
        System.out.println(model + " is sailing on the water.");
    }

    public void dock() {
        System.out.println(model + " is docking at the harbor.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
        System.out.println("Has Life Jackets: " + (hasLifeJackets ? "Yes" : "No"));
    }
}