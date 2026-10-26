package HW6.Tasks;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {

        boolean success =
                participant.getMaxJumpHeight() >= height;

        if (success) {
            participant.jump();

            System.out.println(
                    "Участник " + participant.getName()
                            + " прошёл препятствие " + getName()
                            + " на высоте " + height
            );
        } else {
            System.out.println(
                    "Участник " + participant.getName()
                            + " не прошёл препятствие " + getName()
                            + " на высоте " + height
                            + ". Пройдено "
                            + participant.getMaxJumpHeight()
            );
        }

        return success;
    }

    @Override
    public String getName() {
        return "Стена";
    }

    @Override
    public int getValue() {
        return height;
    }
}
