package HW6.Tasks;

public abstract class BaseParticipant implements Participant {

    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;

    public BaseParticipant(
            String name,
            int maxRunDistance,
            int maxJumpHeight) {

        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }
    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}