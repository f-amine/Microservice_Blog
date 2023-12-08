package com.blog.socialservice.service;

import com.blog.socialservice.model.Like;
import com.blog.socialservice.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public List<Like> findAll() {
        return likeRepository.findAll();
    }

    public <S extends Like> S save(S entity) {
        return likeRepository.save(entity);
    }

    public Optional<Like> findById(Long aLong) {
        return likeRepository.findById(aLong);
    }

    public void delete(Like entity) {
        likeRepository.delete(entity);
    }
}
