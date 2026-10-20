package HW3;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(isNegative(-3));
        System.out.println(isNegative(0));
        System.out.println(isNegative(4));
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }
}


