package com.blog.socialservice.controller;

import com.blog.socialservice.model.Like;
import com.blog.socialservice.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "/api/like")
public class LikeController {
    @Autowired
    LikeService likeService;

    @GetMapping
    public List<Like> findAll() {
        return likeService.findAll();
    }

    @PostMapping
    public <S extends Like> S save(@RequestBody S entity) {
        return likeService.save(entity);
    }

    @GetMapping (path = "/{id}")
    public Optional<Like> findById(@PathVariable Long id) {
        return likeService.findById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Like entity) {
        likeService.delete(entity);
    }
}
