package OOP_Java.lesson_5.controller;

import OOP_Java.lesson_5.service.UserBalance;
import OOP_Java.lesson_5.service.UserBalanceImpl;
import OOP_Java.lesson_5.service.UserService;
import OOP_Java.lesson_5.service.UserServiceImpl;

public class BalanceController {
    private UserBalance balanceController = new UserBalanceImpl();

    public void creditBalance(int index, int money){
        balanceController.creditBalance(index, money);
    }
    public int debitBalance(int index, int money){
        return balanceController.debitBalance(index, money);
    }

    public int getBalance(int index){
        return balanceController.getBalance(index);
    }
}
