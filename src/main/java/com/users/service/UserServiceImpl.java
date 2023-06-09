package com.users.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.users.entity.User;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(101L, "Lee Cooper", "23525625"),
            new User(102L, "John Miller", "99999"),
            new User(103L, "Johnson & Johnson", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id))
        		.findAny().orElse(null);
    }
}