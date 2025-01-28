package com.example.board02.domain;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

public class Board {
    private Long id;                  // 게시글 번호
    private String title;             // 제목
    private String content;           // 내용
    private String writer;            // 작성자
    private int viewCount;            // 조회수
    private LocalDateTime createdDate;    // 작성일
    private LocalDateTime modifiedDate;   // 수정일

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
