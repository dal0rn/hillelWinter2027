package HW7;

import java.util.Scanner;
import java.util.Random;

public class GuessWord {

    public static String getHint(String secretWord, String answer) {

        String hint = "";

        for (int i = 0; i < 15; i++) {

            if (i < secretWord.length()
                    && i < answer.length()
                    && secretWord.charAt(i) == answer.charAt(i)) {

                hint += secretWord.charAt(i);

            } else {
                hint += "#";
            }
        }

        return hint;
    }

    public static void play() {

        String[] words = {
                "apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin",
                "potato"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String secretWord = words[random.nextInt(words.length)];

        System.out.println("=== УГАДАЙ СЛОВО ===");

        while (true) {

            System.out.print("Введите слово: ");

            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals(secretWord)) {
                System.out.println("Поздравляем! Вы угадали!");
                break;
            }

            System.out.println("Неправильно!");
            System.out.println("Подсказка: " + getHint(secretWord, answer));
        }
    }
}