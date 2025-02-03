package com.example.board04.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private int viewCount = 0;

    private int likeCount = 0;

    //@PrePersist: 엔티티가 DB에 저장되기 직전에 자동으로 실행될 메서드를 지정
    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }

    //@PreUpdate: 엔티티가 DB에서 수정되기 직전에 자동으로 실행될 메서드를 지정
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }


    //조회수 증가 메서드
    public void increaseViewCount() {
        this.viewCount++;
    }

    //좋아요 증가 메서드
    public void increaseLikeCount() {
        this.likeCount++;
    }

    //좋아요 감소 메서드
    public void decreaseLikeCount() {
        this.likeCount--;
    }

}
