package com.blog.socialservice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Likes {

    @EmbeddedId
    private LikesId id;

    @MapsId("commentId")
    @ManyToOne
    @JsonBackReference
    private Comment comment;
}