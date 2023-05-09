package OOP_Java.lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Input the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Input operation sign: ");
            String sym = scan.next();
            System.out.print("Input the second number: ");
            double num2 = scan.nextDouble();

            ChoseOperation calc = new ChoseOperation(num1, num2, sym);
            System.out.println(calc.operation(sym));
            System.out.println("Do you want continue? Say YES or NO:");
            String answer = scan.next();
            if (answer.equals("NO")) {
                break;
            }
        }
    }
}
