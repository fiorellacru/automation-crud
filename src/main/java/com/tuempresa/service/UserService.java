package com.tuempresa.service;

import com.tuempresa.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users=new ArrayList<>();

    public UserService() {
        users.add(new User(1L,"Fiorella","QA"));
        users.add(new User(2L,"Bruno","Developer"));
    }

    public List<User> getUsers(){
        return users;
    }

    public User createUser(User user){
        users.add(user);
        return user;
    }

}
