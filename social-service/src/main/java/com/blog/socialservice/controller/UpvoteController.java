package com.blog.socialservice.controller;

import com.blog.socialservice.model.Upvote;
import com.blog.socialservice.service.UpvoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "/api/social/upvote")
@RequiredArgsConstructor
public class UpvoteController {

    private final UpvoteService upvoteService;

    @GetMapping
    public List<Upvote> findAll() {
        return upvoteService.findAll();
    }

    @PostMapping
    public <S extends Upvote> S save(@RequestBody S entity) {
        return upvoteService.save(entity);
    }
    @GetMapping (path = "/{id}")
    public Optional<Upvote> findById(@PathVariable Long id) {
        return upvoteService.findById(id);
    }
    @DeleteMapping
    public void delete(@RequestBody Upvote entity) {
        upvoteService.delete(entity);
    }
}
