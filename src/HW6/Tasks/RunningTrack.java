package HW6.Tasks;


public class RunningTrack implements Obstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {

        boolean success =
                participant.getMaxRunDistance() >= length;

        if (success) {
            participant.run();

            System.out.println(
                    "Участник " + participant.getName()
                            + " прошёл препятствие " + getName()
                            + " на дистанции " + length
            );
        } else {
            System.out.println(
                    "Участник " + participant.getName()
                            + " не прошёл препятствие " + getName()
                            + " на дистанции " + length
                            + ". Пройдено "
                            + participant.getMaxRunDistance()
            );
        }

        return success;
    }

    @Override
    public String getName() {
        return "Беговая дорожка";
    }

    @Override
    public int getValue() {
        return length;
    }
}