package com.losom.phoneselling.phoneselling.contrroller;

import com.losom.phoneselling.phoneselling.entity.User;
import com.losom.phoneselling.phoneselling.service.RoleService;
import com.losom.phoneselling.phoneselling.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }
    @PostConstruct
    public void createNewRolesAndUser() {
        userService.createNewRolesAndUer();
    }
}
