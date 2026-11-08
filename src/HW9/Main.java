package HW9;

import HW9.phonebook.PhoneBook;
import HW9.phonebook.Record;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Record("Ivan", "111-111"));
        phoneBook.add(new Record("Ivan", "222-222"));
        phoneBook.add(new Record("Alex", "333-333"));

        // Пошук першого запису
        System.out.println(phoneBook.find("Ivan"));

        // Пошук усіх записів
        System.out.println(phoneBook.findAll("Ivan"));

        // Пошук відсутнього імені
        System.out.println(phoneBook.find("Peter"));
    }
}