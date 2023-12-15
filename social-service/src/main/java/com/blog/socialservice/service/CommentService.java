package com.blog.socialservice.service;

import com.blog.socialservice.feign.BlogClient;
import com.blog.socialservice.model.Comment;
import com.blog.socialservice.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    private BlogClient blogClient;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    public Optional<Comment> findById(Long aLong) {
        return commentRepository.findById(aLong);
    }

    public void delete(Comment entity) {
        commentRepository.delete(entity);
    }

    public List<Comment> findAllCommentsByBlog(Long blogId) {

        return commentRepository.findAllByBlogId(blogId);
    }
}
