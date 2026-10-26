package HW6.Tasks;

public class Cat extends BaseParticipant {

    public Cat(String name, int maxRunDistance,
               int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run() {
        System.out.println(name + " бежит по-кошачьи.");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгает.");
    }
}
