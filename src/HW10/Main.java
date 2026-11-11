package HW10;


public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("first.txt", 100, "/documents");
        FileData file2 = new FileData("second.txt", 500, "/documents");
        FileData file3 = new FileData("photo.png", 1000, "/images");

        navigator.add("/documents", file1);
        navigator.add("/documents", file2);
        navigator.add("/images", file3);

        for (FileData file : navigator.find("/documents")) {
            System.out.println(file.getName() + " | " +
                    file.getSize() + " | " + file.getPath());
        }

        System.out.println("Файлы размером до 500:");
        for (FileData file : navigator.filterBySize(500)) {
            System.out.println(file.getName() + " | " + file.getSize());
        }

        System.out.println("Сортировка файлов:");
        for (FileData file : navigator.sortBySize()) {
            System.out.println(file.getName() + " | " + file.getSize());
        }

        navigator.remove("/documents");
        System.out.println(navigator.find("/documents"));
    }
}