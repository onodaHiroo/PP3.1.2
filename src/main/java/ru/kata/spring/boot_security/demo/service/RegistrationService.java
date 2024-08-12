package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.model.User;

@Service
public class RegistrationService {

    private final UserDao userDao;

    @Autowired
    public RegistrationService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void register(User user){
        user.setRole("ROLE_USER");
        userDao.addNewUser(user);
    }
}
