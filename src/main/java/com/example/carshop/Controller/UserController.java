package com.example.carshop.Controller;

import com.example.carshop.Models.CarModel;
import com.example.carshop.Models.UserModel;
import com.example.carshop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping ("createuser")
    public UserModel CreateUser(@RequestBody UserModel userModel) {
        return userService.CreateUser(userModel);
    }

    @GetMapping("finduser/{id}")
    public UserModel findUser(@PathVariable String id) {
        return userService.FindUser(id);
    }

    @GetMapping("findallusers")
    public List<UserModel> findAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("updateuser")
    public UserModel updateUser(@RequestBody UserModel userModel) {
        return userService.updateUser(userModel);
    }

    @DeleteMapping("deleteuser/{id}")
    public String deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }
}
