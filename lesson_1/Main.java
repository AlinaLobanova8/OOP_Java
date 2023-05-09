package OOP_Java.lesson_1;

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine machine = new HotDrinksMachine();
        machine.addProduct(new HotDrink("Coffee Americano", 150, 75));
        machine.addProduct(new HotDrink("Black tea", 250, 95));
        machine.addProduct(new HotDrink("Latte", 200, 80));
        machine.addProduct(new HotDrink("Cocao", 300, 85));

        for (HotDrink product: machine.products) {
            System.out.println(product);
        }

        System.out.println(machine.getProduct("Ice tea", 250, 15));
        System.out.println(machine.getProduct("Latte"));
    }
}
