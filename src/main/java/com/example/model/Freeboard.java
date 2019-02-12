package com.example.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity @NoArgsConstructor @AllArgsConstructor
public class Freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "free_id")
    private Long free_id;

    //@Column(name = "content")
    private String content;

    //@Column(name = "title")
    private String title;

    //@Column(name = "writer")
    private String writer;

}