package OOP_Java.lesson_6;

public class Coffee extends HotDrinkProduct {

    public Coffee(String name, Integer volume, Integer temperature) {
        super(name, volume, temperature);
    }

    public String toString() {
        return String.format("Product name: %s, volume: %d, temperature: %d", getName(), getVolume(), getTemperature());
    }
}