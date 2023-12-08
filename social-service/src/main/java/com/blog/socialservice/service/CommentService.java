package com.blog.socialservice.service;

import com.blog.socialservice.model.Comment;
import com.blog.socialservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public <S extends Comment> S save(S entity) {
        return commentRepository.save(entity);
    }

    public Optional<Comment> findById(Long aLong) {
        return commentRepository.findById(aLong);
    }

    public void delete(Comment entity) {
        commentRepository.delete(entity);
    }
}
