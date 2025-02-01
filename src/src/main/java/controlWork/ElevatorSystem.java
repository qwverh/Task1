package controlWork;
import java.util.Random;
//динамика работы лифтов
public class ElevatorSystem {
    private Elevator[] elevators;
    private Call call;
    private Step step;

    public ElevatorSystem(Elevator[] elevators) {
        this.elevators = elevators;
        this.call = new ElevatorCall(elevators);
        this.step = new ElevatorStep();
    }

    public void run(int iterations) {
        Random random = new Random();
        for (int i = 0; i < iterations; i++) {
            if (i % 20 == 0) {
                int targetFloor = random.nextInt(20) + 1;
                ElevatorType type = ElevatorType.values()[random.nextInt(ElevatorType.values().length)];
                try {
                    call.callElevator(type, targetFloor);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }

            for (Elevator elevator : elevators) {
                step.step(elevator);
            }
        }
    }
}
