package module;

public class Transport {
    protected String model;
    protected String year;
    protected int maxSpeed;

    public Transport() {}

    public Transport(String model, String year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + "year: " + year + "maxSpeed: " + maxSpeed + "km/h");
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
