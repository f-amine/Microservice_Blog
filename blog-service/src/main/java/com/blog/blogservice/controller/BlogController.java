package com.blog.blogservice.controller;

import com.blog.blogservice.model.Blog;
import com.blog.blogservice.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @PostMapping
    public <S extends Blog> S save(@RequestBody  S entity) {
        return blogService.save(entity);
    }

    @GetMapping(path ="/{id}")
    public Optional<Blog> findById(@PathVariable Long id) {
        return blogService.findById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Blog entity) {
        blogService.delete(entity);
    }
    @GetMapping
    public List<Blog> findAll() {
        return blogService.findAll();
    }
}
