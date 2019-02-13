package com.example.exampleproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "free_id")
    private Long free_id;

    @Column(name = "content")
    private String content;

    @Column(name = "title")
    private String title;

    @Column(name = "writer")
    private String writer;

}