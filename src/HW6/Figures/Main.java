package HW6.Figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(2),
        new Triangle(8, 6),
        new Square(4)
        };
        System.out.println("Загальна площа " + getTotalArea(figures));
    }

    public static double getTotalArea(Figure[] figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }
}
