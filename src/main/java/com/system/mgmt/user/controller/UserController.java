package com.system.mgmt.user.controller;

import com.system.mgmt.user.model.User;
import com.system.mgmt.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller:User.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    /**
     * コンストラクタインジェクション.
     * @param userRepository Repository.
     */
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * User情報取得.
     * @return Userリスト.
     */
    @GetMapping
    public List<User> getList(){
        return userRepository.findAll();
    }

    /**
     * User登録.
     * @param user Entity.
     * @return User情報(paramと同値).
     */
    @PostMapping
    public User create(@RequestBody User user){
        userRepository.save(user);
        return user;
    }
}
