package HW3;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(isSuminRange(5, 10));
        System.out.println(isSuminRange(3, 2));
        System.out.println(isSuminRange(10, 10));
    }
    private static boolean isSuminRange(int a, int b) {
        int sum = a+b;
        return sum >= 10 && sum <= 20;
    }

}

