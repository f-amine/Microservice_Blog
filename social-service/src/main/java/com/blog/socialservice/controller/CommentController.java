package com.blog.socialservice.controller;

import com.blog.socialservice.model.Comment;
import com.blog.socialservice.repository.CommentRepository;
import com.blog.socialservice.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/social/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }
    @PostMapping
    public Comment save(@RequestBody  Comment comment) {
        return commentService.save(comment);
    }

    @GetMapping (path = "/{id}")
    public Optional<Comment> findById(@PathVariable Long id) {
        return commentService.findById(id);
    }


    @DeleteMapping
    public void delete(@RequestBody  Comment entity) {
        commentService.delete(entity);
    }

    @GetMapping(path = "/blog/{blog-id}")
    public ResponseEntity<List<Comment>> findByBlogId(@PathVariable("blog-id") Long blogId) {
        return ResponseEntity.ok(commentService.findAllCommentsByBlog(blogId));
    }
}
