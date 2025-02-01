package controlWork;
//лифт для нечетных
public class OddFloorElevator extends Elevator {
    @Override
    public boolean canServe(int floor) {
        return floor % 2 != 0;
    }
}
