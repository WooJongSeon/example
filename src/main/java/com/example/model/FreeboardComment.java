package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity @NoArgsConstructor
@Getter @Setter @AllArgsConstructor
@Table(name = "freeboard_comment")
public class FreeboardComment {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "content")
    private String content;

    @Column(name = "write_date")
    private Date writeDate;

    @Column(name = "writer")
    private String writer;

    @Column(name = "comment_origin_id")
    private Long commentOriginId;

    @Column(name = "comment_level")
    private int commentLevel;

    @ManyToOne(targetEntity = Freeboard.class)
    @JoinColumn(foreignKey = @ForeignKey(name = "free_id"))
    private Long freeId;

}
