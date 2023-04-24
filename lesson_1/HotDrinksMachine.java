package OOP_Java.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements Machine {
    List<HotDrink> products = new ArrayList<HotDrink>();

    public void addProduct(HotDrink hotDrink) {
        //hotDrink hotDrink = new HotDrink(name, volume, temp);
        products.add(hotDrink);
    }


    public String getProduct(String name, Integer volume, Integer temp) {
        for (HotDrink product: products) {
            if (product instanceof HotDrink && ((product.getName()).equals(name)) && ((product.getVolume()).equals(volume)) && ((product.getTemp()).equals(temp))) {
                return  String.format("Возьмите свой напиток %s", product);
            }
        }
        return "Такого напитка нет";
    }
    public String getProduct(String name) {
        for (HotDrink product: products) {
            if (product instanceof HotDrink &&(product.getName()).equals(name)){
                return  String.format("Возьмите свой напиток %s %d ml", product.getName(), product.getVolume());
            }
        }
        return "Такого напитка нет";
    }
}
