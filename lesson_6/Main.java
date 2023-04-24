package OOP_Java.lesson_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductInventory<HotDrink> products = new ProductInventory<>();

        products.addProduct(new Tea("Green tea", 250, 80));
        products.addProduct(new Coffee("Espresso", 50, 85));
        products.addProduct(new Cocao("Hot chocolate", 300, 75));

        for (HotDrink product: products.getProducts()) {
            System.out.println(product);
        }

        ProductFinder finder = new ProductFinder(products);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product volume: ");
        Integer productVolume = scanner.nextInt();

        HotDrink hotDrink = finder.findProduct(productName, productVolume);

        if (hotDrink == null) {
            System.out.println("Product not found");
        } else {
            ProductDispenser dispenser = new ProductDispenser(hotDrink);
            dispenser.dispense();
        }
    }
}