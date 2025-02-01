package controlWork;
//реализация интерфейса шага лифта
public class ElevatorStep implements Step {
    @Override
    public void step(Elevator elevator) {
        if (elevator.state == ElevatorState.MOVING_UP) {
            elevator.currentFloor++;
        } else if (elevator.state == ElevatorState.MOVING_DOWN) {
            elevator.currentFloor--;
        }

        if (elevator.targetFloor != null && elevator.currentFloor == elevator.targetFloor) {
            elevator.state = ElevatorState.IDLE;
            elevator.targetFloor = null;
        }
    }
}