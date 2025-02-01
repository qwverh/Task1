package controlWork;
//лифт для сотрудников
public class EmployeeElevator extends Elevator{
    @Override
    public boolean canServe(int floor) {
        return true;
    }
}
