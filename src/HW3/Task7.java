package HW3;

public class Task7{
    public static void main(String[] args) {
        checkNumbSign(5);
        checkNumbSign(0);
        checkNumbSign(-1);
    }

    public static void checkNumbSign(int number) {
        if (number >= 0) {
            System.out.println("Число додатнє");
        } else {
            System.out.println("Число від`ємне");
        }
    }
}
