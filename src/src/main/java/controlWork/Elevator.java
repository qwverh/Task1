package controlWork;

public abstract class Elevator implements ElevatorStateInterface {
    protected ElevatorState state;
    protected int currentFloor; //этаж прибытия, изначально он равен 1
    protected Integer targetFloor; //этаж назначения

    public ELevator(ElevatorState state, int currentFloor, Integer targetFloor) {
        this.state = ElevatorState.IDLE;
        this.currentFloor = 1;
        this.targetFloor = null;
    }
    @Override
    public ElevatorState state() {
        return state;
    }

    public abstract boolean canServe(int floor); //метод, определяющий может ли вызван лифт для этажа
}
