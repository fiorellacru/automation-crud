package com.tuempresa.controller;

import com.tuempresa.model.User;
import com.tuempresa.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController         //Esta clase respondera requests HTTP
@RequestMapping("/users")    //Ruta base
@CrossOrigin            //Permite que frontend pueda consumir API
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping         // Es el endpoint GET
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping        // Es el endpoint POS
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}

//Se exponen endpoints REST para gestión de usuarios mediante un controlador Spring.