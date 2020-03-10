package com.example.DatabaseConnection.service;


import com.example.DatabaseConnection.model.Users;
import com.example.DatabaseConnection.repository.NamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService
{
    @Autowired
    private NamesRepository namesRepository;


    public void saveUser(Users users)
    {
        namesRepository.save(users);
    }

    public List<Users> listAllUsers()
    {
        List<Users> allUsers = namesRepository.findAll();
        return allUsers;
    }



}
