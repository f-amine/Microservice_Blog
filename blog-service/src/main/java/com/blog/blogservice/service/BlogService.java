package com.blog.blogservice.service;


import com.blog.blogservice.client.SocialClient;
import com.blog.blogservice.model.Blog;
import com.blog.blogservice.repository.BlogRepository;
import com.blog.blogservice.response.FullBlogResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;
    private final SocialClient socialClient;
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    public void delete(Blog entity) {
        blogRepository.delete(entity);
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public FullBlogResponse findAllWithComments(Long blogId) {
        var blog = blogRepository.findById(blogId).orElse(Blog.builder().title("Not found").content("Not found").build());
        var comments = socialClient.findAllCommentsByBlog(blogId);//find all comments from social microservice


        return FullBlogResponse.builder()
                .title(blog.getTitle())
                .author(blog.getAuthor())
                .content(blog.getContent())
                .category(blog.getCategory())
                .commentList(comments)
                .publicationDate(blog.getPublicationDate())
                .author(blog.getAuthor())
                .city(blog.getCity())
                .build();
    }
}
