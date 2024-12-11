package module;

public class Auto extends Car{
    protected int countPasseger; //Количество пассажирских мест

    public Auto() {}

    public Auto(String model, String year, int maxSpeed, int numberOfDoors, int countPasseger) {
        super(model, year, maxSpeed, numberOfDoors);
        this.countPasseger = countPasseger;
    }

    public void setCountPasseger(int countPasseger) {
        this.countPasseger = countPasseger;
    }

    public int getCountPasseger() {
        return countPasseger;
    }
    public String canAuto(int n) {
        if (n > countPasseger) {
            return "Машина не сможет перевезти всех";
        } else {
            return "Машина сможет перевести всех";
        }
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество пассажирских мест " + countPasseger);
    }

}
