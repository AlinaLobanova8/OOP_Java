package OOP_Java.lesson_5.view;

import OOP_Java.lesson_5.controller.BalanceController;
import OOP_Java.lesson_5.controller.UserController;
import OOP_Java.lesson_5.model.User;
import OOP_Java.lesson_5.repository.UserRepository;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();

        userController.saveUser("Михаил", 28);
        userController.saveUser("Андрей", 37);
        userController.saveUser("Анна", 55);
        userController.saveUser("Юлия", 43);


        BalanceController balanceController = new BalanceController();
        balanceController.creditBalance(0, 15000);//начисление
        balanceController.creditBalance(1, 5000);
        balanceController.creditBalance(2, 55000);
        balanceController.creditBalance(3, 10000);

        balanceController.debitBalance(1, 6000);//снятие
        balanceController.debitBalance(2, 20000);

        int index = 0;
        for (User user : userController.getUserList()) {
            System.out.printf("Index of person in the list: %d %s\n", index, user);
            index++;
        }

        userController.removeUser(userController.getUserList().get(1));
        int i = 0;
        for (User user : userController.getUserList()) {
            System.out.printf("Index of person in the list: %d %s\n", i, user);
            i++;
        }
    }
}
