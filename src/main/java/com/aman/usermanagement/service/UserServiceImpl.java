package com.aman.usermanagement.service;


import java.util.List;

import javax.transaction.Transactional;

import com.aman.usermanagement.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import com.aman.usermanagement.entity.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
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

        return userRepository.findById(userId).get();

    }

    //@Override
    public boolean updateStatus(int userId, boolean userStatus) {
        // TODO Auto-generated method stub
        User user = userRepository.findById(userId).get();

        user.setActive(userStatus);

        userRepository.save(user);

        return userStatus;

    }

    @Override
    public User deleteUserById(Integer userId) {
        // TODO Auto-generated method stub
    	
    	User user = userRepository.findById(userId).get();
        userRepository.deleteById(userId);
    	//userRepository.delete(user)

        return user;
    }

    @Override
    public List<User> getAllUsers(Integer pageNumber, Integer pageSize) {
        // TODO Auto-generated method stub

        Pageable pageable = PageRequest.of(pageNumber,pageSize);

        Page<User> users = userRepository.findAll(pageable);
        return users.getContent();
    }


}
