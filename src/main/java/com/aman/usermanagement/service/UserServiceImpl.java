package com.aman.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aman.usermanagement.entity.User;
import com.aman.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        // TODO Auto-generated method stub

        return userRepository.save(user);

    }

    @Override
    public User getUserById(Integer userId) {
        // TODO Auto-generated method stub

        return userRepository.getUserById(userId);

    }

    //@Override
    public boolean updateStatus(int userId, boolean userStatus) {
        // TODO Auto-generated method stub
        User user = userRepository.getUserById(userId);

        user.setActive(userStatus);

        userRepository.update(user);

        return userStatus;

    }

    @Override
    public User deleteUserById(Integer userId) {
        // TODO Auto-generated method stub



        return userRepository.deleteUserById(userId);


    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return userRepository.getAllUsers();
    }

    //@Override
    ///public boolean updateStatus(Integer userId) {
    // TODO Auto-generated method stub
    ///////////return false;
    //}

}
