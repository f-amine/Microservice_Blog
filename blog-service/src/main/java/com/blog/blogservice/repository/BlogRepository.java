package com.blog.blogservice.repository;

import com.blog.blogservice.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository< Blog, Long> {

}
