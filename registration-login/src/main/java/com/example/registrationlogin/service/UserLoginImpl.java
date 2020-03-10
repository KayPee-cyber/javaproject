package com.example.registrationlogin.service;

import com.example.registrationlogin.model.User;
import com.example.registrationlogin.model.UserLogin;

public interface UserLoginImpl
{

   public void saveUser(UserLogin userLogin);
    boolean existsByEmailAndPassword(String email, String password);
}


