package com.blog.socialservice.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;
    private Long user_id;
    private String comment_text;
    private Long blog_id;

    @OneToMany(mappedBy = "comment")
    @JsonIgnore
    private List<Like> likes;

}
