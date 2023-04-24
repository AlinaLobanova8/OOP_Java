package OOP_Java.lesson_4;

public class HotDrinkProduct {
    private String name;
    private Integer volume;
    private Integer temp;


    public HotDrinkProduct(String name, Integer volume) {
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