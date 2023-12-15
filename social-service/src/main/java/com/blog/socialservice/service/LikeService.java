package com.blog.socialservice.service;

import com.blog.socialservice.exception.ResourceNotFoundException;
import com.blog.socialservice.model.Comment;
import com.blog.socialservice.model.Likes;
import com.blog.socialservice.repository.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LikeService {

    private final LikeRepository likeRepository;

    private final CommentService commentService;

    public List<Likes> findAll() {
        return likeRepository.findAll();
    }

    public <S extends Likes> S save(S entity) {
        Comment comment = commentService.findById(entity.getId().getCommentId())
                .orElseThrow(() -> new ResourceNotFoundException("Comment not found with id " + entity.getId().getCommentId()));
        entity.setComment(comment);
        return likeRepository.save(entity);
    }

    public Optional<Likes> findById(Long aLong) {
        return likeRepository.findById(aLong);
    }

    public void delete(Likes entity) {
        likeRepository.delete(entity);
    }
}