package HW6.Tasks;

public class Human extends BaseParticipant {

    public Human(String name, int maxRunDistance,
                 int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run() {
        System.out.println(name + " бежит.");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгает.");
    }
}
