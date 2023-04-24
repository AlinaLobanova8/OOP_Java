package OOP_Java.lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ProductInventory<T extends HotDrink> {

    private List<T> products = new ArrayList<>();

    public void addProduct(T hotDrink) {
        products.add(hotDrink);
    }

    public List<T> getProducts() {
        return products;
    }
}