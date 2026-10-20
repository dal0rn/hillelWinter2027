package HW3;

public class Task9 {
    public static void main(String[] args) {
        printMiltipleTimes(9, "Hello");
    }
    public static void printMiltipleTimes(int count, String message) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(count + " " + message);
        }
    }
}
