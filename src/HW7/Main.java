package HW7;

public class Main {
        public static void main(String[] args) {

            // Задание 2
            System.out.println("Задание 2:");
            System.out.println(
                    findSymbolOccurance.findSymbolOccurance("Hello Java", 'a')
            );

            // Задание 3
            System.out.println("\nЗадание 3:");
            System.out.println(
                    findWordPosition.findWordPosition("Apollo", "pollo")
            );

            // Задание 4
            System.out.println("\nЗадание 4:");
            System.out.println(
                    StringReverse.stringReverse("Hello")
            );

            // Задание 5
            System.out.println("\nЗадание 5:");
            System.out.println(
                    isPalindrome.IsPalindrome("ERE")
            );

            // Задание 6
            System.out.println("\nЗадание 6:");
            GuessWord.play();
        }
}

