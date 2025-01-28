package com.example.board03.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String content;

    //조회수
    @Column(nullable = false)
    private int views;

    //생성시간 updatable = false는 값이 한 번 설정되면 변경되지 않도록 설정해 주는 속성
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    //자동 시간 저장
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    //조회수 증가 메서드
    public void increaseViews() {
        this.views++;
    }


}
