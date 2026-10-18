public class Task4 {
    public static void main(String[] args) {
        printColor();
    }

    private static void printColor() {
        int value = 67;

        if (value <= 0 ) {
            System.out.println("Червони");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }



    }

}
