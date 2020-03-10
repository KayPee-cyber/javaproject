package com.example.Blog.model;

import javax.persistence.*;

@Entity
@Table(name = "allPosts")
public class Posts
{

    public Long getId()
    {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "postTitle")
    private String postTitle;
    @Column(name = "postBody")
    private String postBody;

    public String getPostTitle()
    {
        return postTitle;
    }

    public void setPostTitle(String postTitle)
    {
        this.postTitle = postTitle;
    }

    public String getPostBody()
    {
        return postBody;
    }

    public void setPostBody(String postBody)
    {
        this.postBody = postBody;
    }
}