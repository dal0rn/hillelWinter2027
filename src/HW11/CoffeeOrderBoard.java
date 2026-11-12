package HW11;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders = new ArrayList<>();
    private int lastNumber = 0;


    public void add(String name) {
        lastNumber++;
        orders.add(new Order(lastNumber, name));
    }


    public Order deliver() {
        if (orders.isEmpty()) {
            System.out.println("Черга порожня");
            return null;
        }
        return orders.remove(0);
    }

    // 5. Видає замовлення з певним номером
    public Order deliver(int number) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getNumber() == number) {
                iterator.remove();
                return order;
            }
        }
        System.out.println("Замовлення з номером " + number + " не знайдено");
        return null;
    }

    // 6. Виводить поточний стан черги
    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
