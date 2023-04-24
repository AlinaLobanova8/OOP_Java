package OOP_Java.lesson_5.repository;

import java.util.ArrayList;
import java.util.List;

import OOP_Java.lesson_5.model.User;

public class UserRepository {
    private static List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        System.out.println("remove user");
        userList.remove(user);
    }
    public void updateUser(int index, User user) {
        userList.set(index, user);
    }
    public List<User> getUserList() {
        return userList;
    }

    static public void creditBalance(int index, int money) {
        userList.get(index).creditBalance(money);
    }
    static public int debitBalance(int index, int money) {
        return userList.get(index).debitBalance(money);
    }
    static public int getBalance(int index) {
        return userList.get(index).getBalance();
    }
}
