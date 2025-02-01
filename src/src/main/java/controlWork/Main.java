package controlWork;

public class Main {
    public static void main(String[] args) {
        Elevator[] elevators = new Elevator[7]; // Создаем массив лифтов
        elevators[0] = new EvenFloorElevator();
        elevators[1] = new EvenFloorElevator();
        elevators[2] = new EvenFloorElevator();
        elevators[3] = new OddFloorElevator();
        elevators[4] = new OddFloorElevator();
        elevators[5] = new OddFloorElevator();
        elevators[6] = new EmployeeElevator();

        ElevatorSystem system = new ElevatorSystem(elevators);
        system.run(10000);
    }
}
