package controlWork;
//лифт для четных
public class EvenFloorElevator extends Elevator{
    @Override
    public boolean canServe(int floor) {
        return floor % 2 == 0;
    }
}
