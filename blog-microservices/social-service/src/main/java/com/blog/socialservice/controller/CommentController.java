package com.blog.socialservice.controller;

import com.blog.socialservice.model.Comment;
import com.blog.socialservice.repository.CommentRepository;
import com.blog.socialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }
    @PostMapping
    public <S extends Comment> S save(@RequestBody  S entity) {
        return commentService.save(entity);
    }

    @GetMapping (path = "/{id}")
    public Optional<Comment> findById(@PathVariable Long id) {
        return commentService.findById(id);
    }


    @DeleteMapping
    public void delete(@RequestBody  Comment entity) {
        commentService.delete(entity);
    }
}
