package HW5;

public abstract class Animal {
    private static int animalCount = 0;
    private static int dogCount = 0;
    private static int catCount = 0;

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;

        Animal.animalCount++;
        Animal.dogCount++;
        Animal.catCount++;
    }

    public void run (int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробіг "  + distance + "м");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + "м (ліміт: " + runLimit + " м)");
        }
    }
    public void swim (int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " проплив " + distance + "м");
        } else  {
            System.out.println(name + " не зміг проплисти " + distance + "м (ліміт: " + swimLimit + "м");
        }

    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static int getCatCount() {
        return catCount;
    }
}
