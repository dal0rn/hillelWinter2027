package HW9;

import java.util.*;

public class ListTasks {

    // Завдання 1
    public static int countOccurance(List<String> list, String word) {
        int count = 0;

        for (String element : list) {
            if (element.equals(word)) {
                count++;
            }
        }

        return count;
    }

    // Завдання 2
    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int number : array) {
            list.add(number);
        }

        return list;
    }

    // Завдання 3
    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        return new ArrayList<>(uniqueNumbers);
    }

    // Завдання 4
    public static void calcOccurance(List<String> list) {
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String word : list) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Завдання 5
    public static List<wordOccurrence> findOccurance(List<String> list) {
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String word : list) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }

        List<wordOccurrence> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            result.add(new wordOccurrence(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}
