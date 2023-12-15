package com.blog.socialservice.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Long blogId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "comment")
    @JsonManagedReference
    private List<Likes> likes;

}
