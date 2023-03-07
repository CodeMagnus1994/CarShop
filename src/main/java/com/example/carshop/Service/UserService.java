package com.example.carshop.Service;

import com.example.carshop.Models.UserModel;
import com.example.carshop.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserModel CreateUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserModel FindUser(String id) {
        return userRepository.findById(id).get();
    }

    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }

    public UserModel updateUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return "user " + id + " has been deleted!";
    }
}
