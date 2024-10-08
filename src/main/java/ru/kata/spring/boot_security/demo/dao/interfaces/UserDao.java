package ru.kata.spring.boot_security.demo.dao.interfaces;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);

    List<User> getListOfUsers();

    void updateUser(User user);

    void removeUserById(long id);

    User show(Long id);

    User findByEmail(String email);
}
