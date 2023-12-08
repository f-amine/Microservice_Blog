package com.blog.socialservice.feign;

import com.blog.socialservice.dto.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "social", url = "${application.config.blog-url}")
public interface BlogClient {

    @GetMapping("/{id}")
    Blog blogExists(@PathVariable ("id") Long id);
}
