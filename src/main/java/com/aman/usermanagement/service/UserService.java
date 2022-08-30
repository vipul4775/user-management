package com.aman.usermanagement.service;

import java.util.List;

import com.aman.usermanagement.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    User createUser(User user);

    User getUserById(Integer userId);

    List<User> getAllUsers(Integer pageNumber, Integer pageSize);

    //boolean updateStatus(Integer userId);
    User deleteUserById(Integer userId);

    boolean updateStatus(int userId, boolean status);

}
