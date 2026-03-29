package com.system.mgmt.user.controller;

import com.system.mgmt.user.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    /**
     * User情報取得.
     * @return Userリスト.
     */
    @GetMapping
    public List<User> getList(){
        return users;
    }

    /**
     * User登録.
     * @param user
     * @return User情報(paramと同値).
     */
    @PostMapping
    public User create(@RequestBody User user){
        users.add(user);
        return user;
    }
}
