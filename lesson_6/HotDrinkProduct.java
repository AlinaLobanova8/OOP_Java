package OOP_Java.lesson_6;

public class HotDrinkProduct implements HotDrink {
    private String name;
    private Integer volume;
    private Integer temperature;

    public HotDrinkProduct(String name, Integer volume, Integer temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }
}