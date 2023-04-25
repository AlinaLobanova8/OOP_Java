package OOP_Java.lesson_2;

public class ChoseOperation extends Calculator{
    public ChoseOperation(double num1, double num2, String sym) {
        super(num1, num2, sym);
    }

    public String operation(String sym) {
        switch (sym) {
            case "+":
                return (String.format("%.2f + %.2f = %.2f", getNum1(), getNum2(), summa()));
            case "-":
                return String.format("%.2f - %.2f = %.2f", getNum1(), getNum2(), difference());
            case "*":
                return String.format("%.2f * %.2f = %.2f", getNum1(), getNum2(), multiply());
            case "/":
                return String.format("%.2f / %.2f = %.2f", getNum1(), getNum2(), devide());
            default:
                return null;
        }
    }
}