package com.SpringBootJpaEntityUniqueConstraint.service;


import com.SpringBootJpaEntityUniqueConstraint.entity.User;
import com.SpringBootJpaEntityUniqueConstraint.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUser(Long primaryKey){
        return userRepository.findById(primaryKey).get();
    }
}
