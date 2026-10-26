package HW6.Tasks;

public class Robot extends BaseParticipant {

    public Robot(String name, int maxRunDistance,
                 int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run() {
        System.out.println(name + " активирует режим бега.");
    }

    @Override
    public void jump() {
        System.out.println(name + " выполняет прыжок.");
    }
}