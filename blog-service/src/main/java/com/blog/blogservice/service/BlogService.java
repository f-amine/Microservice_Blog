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

    public <S extends Blog> S save(S entity) {
        return blogRepository.save(entity);
    }

    public Optional<Blog> findById(Long aLong) {
        return blogRepository.findById(aLong);
    }

    public void delete(Blog entity) {
        blogRepository.delete(entity);
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
