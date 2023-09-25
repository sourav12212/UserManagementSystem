package com.geekster.UserManagementSystem.Controller;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody List<User> newUser){
        return userService.addUserDetails(newUser);
    }

    @GetMapping("get/User/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUserDetails(id);
    }

    @GetMapping("get/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("user/id/phoneNumber")
    public String updateUserById(@RequestParam Integer id,@RequestParam String phoneNumber){
        return userService.updateUserByPhoneNumber(id,phoneNumber);
    }

    @DeleteMapping("user/id/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }
}

