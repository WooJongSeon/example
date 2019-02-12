package com.example.controller;

import com.example.model.Freeboard;
import com.example.model.FreeboardComment;
import com.example.service.freeboardComment.FreeboardCommentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class FreeboardCommentController {

    @Autowired
    private FreeboardCommentListService freeboardCommentListService;

    @Autowired
    private HttpSession session;

    @GetMapping("/freeboardCommentList")
    public ResponseEntity freeboardCommentList(){
        Freeboard freeboard = (Freeboard) session.getAttribute("freeboard");
        List<FreeboardComment> commentList = freeboardCommentListService.getList(freeboard.getFree_id());

        return ResponseEntity.ok().body(commentList);
    }
}
