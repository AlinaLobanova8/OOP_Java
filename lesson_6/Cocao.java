package OOP_Java.lesson_6;

public class Cocao extends HotDrinkProduct {

    public Cocao(String name, Integer volume, Integer temperature) {
        super(name, volume, temperature);
    }

    public String toString() {
        return String.format("Product name: %s, volume: %d, temperature: %d", getName(), getVolume(), getTemperature());
    }
}
