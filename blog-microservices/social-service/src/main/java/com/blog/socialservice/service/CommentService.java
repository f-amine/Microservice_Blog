package com.blog.socialservice.service;

import com.blog.socialservice.model.Comment;
import com.blog.socialservice.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private WebClient webClient;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public <S extends Comment> S save(S entity) {
        // Call Blog Service to get the id of the blog
        webClient.get().uri("http://localhost:8080/api/blog").retrieve().bodyToMono(Boolean.class).block();
        return commentRepository.save(entity);
    }

    public Optional<Comment> findById(Long aLong) {
        return commentRepository.findById(aLong);
    }

    public void delete(Comment entity) {
        commentRepository.delete(entity);
    }
}
