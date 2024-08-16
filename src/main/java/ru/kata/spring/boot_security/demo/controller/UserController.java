package ru.kata.spring.boot_security.demo.controller;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;


@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("")
    public String currentUserName(Authentication authentication, ModelMap modelMap) {
        User user = (User) authentication.getPrincipal();
        modelMap.addAttribute("user", user);
        return "user/user";
    }
}
