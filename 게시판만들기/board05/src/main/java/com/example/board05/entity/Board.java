package com.example.board05.entity;

import com.example.board05.dto.request.BoardRequest;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor // 모든 필드를 포함한 생성자 생성
@NoArgsConstructor  // 기본 생성자 생성
@Builder  //빌터 패턴
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String content;


}
