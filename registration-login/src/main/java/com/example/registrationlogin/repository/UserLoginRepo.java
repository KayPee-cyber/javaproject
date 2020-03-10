package com.example.registrationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userLoginRepo")
public interface UserLoginRepo extends JpaRepository<UserLoginRepo, Long>
{
//    boolean existsByEmailAndPassword(String email, String password);
}



















