package HW6.Tasks;

public class Main {

    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Вася", 1000, 100),
                new Cat("Гарфилд", 500, 200),
                new Robot("R2D2", 2000, 150)
        };

        Obstacle[] obstacles = {
                new RunningTrack(300),
                new Wall(120),
                new RunningTrack(700),
                new Wall(180)
        };

        for (Participant participant : participants) {

            System.out.println(
                    "\nНачинает участник: "
                            + participant.getName()
            );

            for (Obstacle obstacle : obstacles) {

                boolean success = obstacle.overcome(participant);

                if (!success) {
                    System.out.println(
                            participant.getName()
                                    + " выбывает из соревнования!"
                    );

                    break;
                }
            }
        }
    }
}
