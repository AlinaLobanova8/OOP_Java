package OOP_Java.lesson_1;

public class Product {
    private String name;
    private Integer volume;

    Product(String name, Integer volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    public Integer getVolume() {
        return volume;
    }
}
