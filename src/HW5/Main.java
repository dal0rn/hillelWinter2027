package HW5;

import java.sql.SQLOutput;

public class Main {
    static void main(String[] args) {
        Animal dogSharik = new Dog("Пес Sharik");
        Animal dogPatrone = new Dog("Пес Patrone");
        Animal catBarsik = new Cat("Кіт Barsik");

        dogPatrone.run(150);
        dogPatrone.swim(5);

        catBarsik.run(250);
        catBarsik.swim(3);

        System.out.println("-----------");
        System.out.println("Створено котів: " + Animal.getCatCount());
        System.out.println("Створено собак: " + Animal.getDogCount());
        System.out.println("Всього тварин: " + Animal.getAnimalCount());
    }
}
