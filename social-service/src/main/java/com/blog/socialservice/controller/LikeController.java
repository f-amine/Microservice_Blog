package com.blog.socialservice.controller;

import com.blog.socialservice.model.Likes;
import com.blog.socialservice.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "/api/social/like")
@RequiredArgsConstructor
public class LikeController {

    private final LikeService likeService;

    @GetMapping
    public List<Likes> findAll() {
        return likeService.findAll();
    }

    @PostMapping
    public <S extends Likes> S save(@RequestBody S entity) {
        return likeService.save(entity);
    }

    @GetMapping (path = "/{id}")
    public Optional<Likes> findById(@PathVariable Long id) {
        return likeService.findById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Likes entity) {
        likeService.delete(entity);
    }
}
