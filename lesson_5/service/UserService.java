package OOP_Java.lesson_5.service;

import java.util.List;

import OOP_Java.lesson_5.model.User;

public class UserService {
    void saveUser(User user);
    void removeUser(User user);
    void updateUser(int index, User user);
    List<User> getUserList();
}
