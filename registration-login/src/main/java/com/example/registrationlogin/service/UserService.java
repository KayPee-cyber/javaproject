package com.example.registrationlogin.service;

import com.example.registrationlogin.model.User;
import com.example.registrationlogin.model.UserLogin;
import com.example.registrationlogin.repository.UserLoginRepo;
import com.example.registrationlogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service("userLoginImpl")
public class UserService implements UserLoginImpl
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserLoginRepo userLoginRepo;


    public void saveUser(User user)
    {
        userRepository.save(user);
    }

    @Override
    public void saveUser(UserLogin userLogin)
    {}

    @Override
    public boolean existsByEmailAndPassword(String email, String password)
    {
        return false;
    }
}
