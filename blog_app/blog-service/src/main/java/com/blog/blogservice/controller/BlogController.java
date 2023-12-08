package com.blog.blogservice.controller;

import com.blog.blogservice.model.Blog;
import com.blog.blogservice.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @PostMapping
    public Blog save(@RequestBody  Blog blog) {
        return blogService.save(blog);
    }

    @GetMapping(path ="/{id}")
    public Optional<Blog> findById(@PathVariable("id") Long id) {
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
