package com.example.model;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@Entity @NoArgsConstructor @AllArgsConstructor
@Table(name = "freeboard")
public class Freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "free_id")
    private Long freeId;

    @Column(name = "content")
    private String content;

    @Column(name = "title")
    private String title;

    @Column(name = "writer")
    private String writer;

}