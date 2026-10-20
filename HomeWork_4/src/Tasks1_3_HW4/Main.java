package Tasks1_3_HW4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
         "Vasiliy Petrovich",
                "Junior Java Developer",
                "vasya1337@gmail.com",
                "380998765432",
                36
        );

        System.out.println("Name-> " + employee.getfullName());
        System.out.println("Postion-> " + employee.getPosition());
        System.out.println("Email-> " + employee.getEmail());
        System.out.println("Number-> " + employee.getNumber());
        System.out.println("Age-> " + employee.getAge());
    }
}
