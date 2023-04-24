package OOP_Java.lesson_4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends HotDrinkProduct> {

    private List<T> products = new ArrayList<>();

    public void addProduct(T hotDrink) {
        products.add(hotDrink);
    }

    public List<T> getProducts() {
        return products;
    }

    public String getProduct(String name, Integer volume, Integer temp) {
        for (T product : products) {
            if (product instanceof T && ((product.getName()).equals(name)) && ((product.getVolume()).equals(volume))) {
                return String.format("Возьмите свой напиток %s", product);
            }
        }
        return "Такого напитка нет";
    }
}