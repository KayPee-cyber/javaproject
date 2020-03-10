package com.example.registrationlogin.model;

import javax.persistence.*;

@Entity
@Table(name = "userlogin")
public class UserLogin
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public Long getId()
    {
        return id;
    }
    private String username;
    private String passcode;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPasscode()
    {
        return passcode;
    }

    public void setPasscode(String passcode)
    {
        this.passcode = passcode;
    }
}
