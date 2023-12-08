package com.blog.socialservice.service;

import com.blog.socialservice.model.Upvote;
import com.blog.socialservice.repository.UpvoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpvoteService {

    @Autowired
    UpvoteRepository upvoteRepository;

    public List<Upvote> findAll() {
        return upvoteRepository.findAll();
    }

    public <S extends Upvote> S save(S entity) {
        return upvoteRepository.save(entity);
    }

    public Optional<Upvote> findById(Long aLong) {
        return upvoteRepository.findById(aLong);
    }

    public void delete(Upvote entity) {
        upvoteRepository.delete(entity);
    }
}
