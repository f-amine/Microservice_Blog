package com.blog.socialservice.repository;

import com.blog.socialservice.model.Upvote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpvoteRepository extends JpaRepository<Upvote,Long> {
}
