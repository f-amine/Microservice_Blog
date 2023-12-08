package com.blog.blogservice.service;


import com.blog.blogservice.model.Blog;
import com.blog.blogservice.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;

    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    public void delete(Blog entity) {
        blogRepository.delete(entity);
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

}
