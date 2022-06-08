package com.job.portal.service;


import com.job.portal.model.User;
import com.job.portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        Optional<User> optional = userRepository.findById(id);
        User user;
        if(optional.isPresent()) {
            user = optional.get();
        }
        else
            throw new RuntimeException("User Not Found");
        return user;
    }
}