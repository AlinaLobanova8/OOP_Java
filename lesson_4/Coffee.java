package OOP_Java.lesson_4;

public class Coffee extends HotDrinkProduct {

    private Integer temp;

    public Coffee(String name, Integer volume, Integer temp) {
        super(name, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }
    public String toString() {
        return String.format("Product name: %s, volume: %d , temperature: %d", getName(), getVolume(), temp);
    }
}