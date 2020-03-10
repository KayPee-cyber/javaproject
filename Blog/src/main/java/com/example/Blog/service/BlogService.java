package com.example.Blog.service;


import com.example.Blog.model.Posts;
import com.example.Blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService
{
    @Autowired
    private PostRepository postRepository;


    public void saveUser(Posts posts)
    {
        postRepository.save(posts);
    }
}
