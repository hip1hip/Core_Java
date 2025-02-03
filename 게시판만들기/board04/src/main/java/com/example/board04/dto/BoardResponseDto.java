package com.example.board04.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
// ResponseDto는 @Setter 쓰는게 좋지 않음 , 불변성 때문에 @Builder를 씀
@Getter
@Builder
public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private int viewCount;
    private int likeCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt; 
    private List<CommentResponseDto> comments; // 댓글 리스트 추가

}
