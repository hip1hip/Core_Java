package com.example.board.service;

import com.example.board.dto.PostRequestDto;
import com.example.board.dto.PostResponseDto;
import com.example.board.entity.Comment;
import com.example.board.entity.Post;
import com.example.board.repository.CommentRepository;
import com.example.board.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public List<PostResponseDto> getAllPosts(){
        List<Post> posts = postRepository.findAll(); // Post 엔티티 리스트 가져오기
        return posts.stream()
                .map(post -> {
                    PostResponseDto dto = new PostResponseDto();
                    dto.setId(post.getId());
                    dto.setTitle(post.getTitle());
                    dto.setContent(post.getContent());
                    dto.setAuthor(post.getAuthor());
                    dto.setCategory(post.getCategory());
                    
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public PostResponseDto getPostById(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found with id: " + id));

        List<Comment> comments = commentRepository.findById(id);

        PostResponseDto dto = new PostResponseDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setAuthor(post.getAuthor());
        dto.setCategory(post.getCategory());

        // 댓글 목록 DTO로 변환 
        

        return dto;
    }

    public PostResponseDto createPost(PostRequestDto requestDto) {
        Post post = new Post();
        post.setTitle(requestDto.getTitle());
        post.setContent(requestDto.getContent());
        post.setAuthor(requestDto.getAuthor());
        post.setCategory(requestDto.getCategory());
        Post savedPost = postRepository.save(post);

        PostResponseDto dto = new PostResponseDto();
        dto.setId(savedPost.getId());
        dto.setTitle(savedPost.getTitle());
        dto.setContent(savedPost.getContent());
        dto.setAuthor(savedPost.getAuthor());
        dto.setCategory(savedPost.getCategory());
        return dto;
    }

    public PostResponseDto updatePost(Long id, PostRequestDto requestDto){
        Post post = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("글을 찾을 수 없습니다."));
        post.setTitle(requestDto.getTitle());
        post.setContent(requestDto.getContent());
        post.setAuthor(requestDto.getAuthor());
        post.setCategory(requestDto.getCategory());
        Post updatedPost = postRepository.save(post);

        PostResponseDto dto = new PostResponseDto();
        dto.setId(updatedPost.getId());
        dto.setContent(updatedPost.getContent());
        dto.setAuthor(updatedPost.getAuthor());
        dto.setCategory(updatedPost.getCategory());
        return dto;

    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

}
