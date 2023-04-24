package OOP_Java.lesson_1;

public class HotDrink extends Product{
    private Integer temp;

    public HotDrink(String name, Integer volume, Integer temp) {
        super(name, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public String toString() {
        return String.format("Product name: %s, volume: %d , temperature: %d", super.getName(), super.getVolume(), temp);
    }
}