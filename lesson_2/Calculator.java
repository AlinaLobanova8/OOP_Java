package OOP_Java.lesson_2;

public class Calculator implements Operation {
    private double num1;
    private double num2;
    private String sym;

    public Calculator(double num1, double num2, String sym) {
        this.num1 = num1;
        this.num2 = num2;
        this.sym = sym;
    }

    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public String getSym() {
        return sym;
    }
    @Override
    public double summa() {
        double summ = num1 + num2;
        return summ;
    }
    @Override
    public double difference() {
        double diff = num1 - num2;
        return diff;
    }
    @Override
    public double multiply() {
        double mult = num1 * num2;
        return mult;
    }
    @Override
    public double devide() {
        double dev = num1 / num2;
        return dev;
    }
}