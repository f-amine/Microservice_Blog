package com.blog.socialservice.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Blog {
    private String title;
    private String content;
    private LocalDateTime publicationDate;
    private Long author;
}
