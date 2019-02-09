package com.example.repository;

import com.example.model.FreeboardComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FreeboardCommentRepository extends JpaRepository<FreeboardComment,Long> {
    List<FreeboardComment> findAllByFreeId(Long freeId);
}
