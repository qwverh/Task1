package controlWork;
//реализация интерфеса вызова
public class ElevatorCall implements Call {
    private Elevator[] elevators;

    public ElevatorCall(Elevator[] elevators) {
        this.elevators = elevators;
    }

    @Override
    public void callElevator(ElevatorType type, int targetFloor) {
        Elevator elevator = findAvailableElevator(type);
        if (elevator != null) {
            elevator.targetFloor = targetFloor;
            elevator.state = targetFloor > elevator.currentFloor ? ElevatorState.MOVING_UP : ElevatorState.MOVING_DOWN;
        } else {
            throw new RuntimeException("Все лифты заняты или неисправны. Тип лифта: " + type + ", этаж: " + targetFloor);
        }
    }

    private Elevator findAvailableElevator(ElevatorType type) {
        for (Elevator elevator : elevators) {
            if (elevator.state == ElevatorState.IDLE && elevator.canServe(targetFloorForType(type))) {
                return elevator;
            }
        }
        return null;
    }

    private int targetFloorForType(ElevatorType type) {
        return type == ElevatorType.EVEN ? 2 : 1;
    }
}