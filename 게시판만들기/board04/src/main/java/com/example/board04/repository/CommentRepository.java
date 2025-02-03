package com.example.board04.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.board04.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

    List<Comment> findByBoardIdOrderByCreatedAtDesc(Long boardId);
}
