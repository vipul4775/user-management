package com.aman.usermanagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aman.usermanagement.entity.User;
import com.aman.usermanagement.service.UserService;

@RestController
@RequestMapping("api/users")

public class UserController {


    @Autowired
    private UserService userService;


    //POST - Create user

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = this.userService.createUser(user);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }


    //GET - get all users

    @GetMapping("/getallusers/")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(value = "pageNumber",defaultValue = "0",
            required = false) Integer pageNumber, @RequestParam(value = "pageSize",defaultValue = "2",
            required = false) Integer pageSize) {
        return ResponseEntity.ok(this.userService.getAllUsers(pageNumber,pageSize));
    }


    //GET - get user by id

    @GetMapping("/{userId}/")
    public ResponseEntity<User> getUserById(@PathVariable Integer userId) {

        return ResponseEntity.ok(this.userService.getUserById(userId));

    }


    //PUT - Update user active/inactive status

    @PutMapping("/updateuser/")
    public ResponseEntity<?> updateStatus(@RequestParam Integer userId, @RequestParam boolean status) {
        boolean result = this.userService.updateStatus(userId, status);
        return new ResponseEntity(Map.of("message", "User Status Updated Successfully"), HttpStatus.OK);

    }


    //DELETE - delete a user by id;

    @DeleteMapping("/{userId}/")

    public ResponseEntity<?> deleteUserById(@PathVariable Integer userId) {
        userService.deleteUserById(userId);
        return new ResponseEntity(Map.of("message", "User deleted Successfully"), HttpStatus.OK);
    }

}
