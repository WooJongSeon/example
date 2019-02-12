package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity @NoArgsConstructor
@AllArgsConstructor @Data
public class FreeboardComment {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "comment_id")
    private Long comment_id;

    //@Column(name = "content")
    private String content;

    //@Column(name = "write_date")
    private Date write_date;

    //@Column(name = "writer")
    private String writer;

    //@Column(name = "comment_origin_id")
    private Long comment_origin_id;

    //@Column(name = "comment_level")
    private int comment_level;

    @ManyToOne(targetEntity = Freeboard.class)
    //@JoinColumn(foreignKey = @ForeignKey(name = ""))
    private Long free_id;

}
