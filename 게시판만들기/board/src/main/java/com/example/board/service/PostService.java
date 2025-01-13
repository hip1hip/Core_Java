package com.example.board.service;

import com.example.board.dto.PostRequestDto;
import com.example.board.entity.Post;
import com.example.board.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found with id: " + id));
    }

    public Post createPost(PostRequestDto requestDto) {
        Post post = new Post();
        post.setTitle(requestDto.getTitle());
        post.setContent(requestDto.getContent());
        post.setAuthor(requestDto.getAuthor());
        post.setCategory(requestDto.getCategory());
        return postRepository.save(post);
    }

    public Post updatePost(Long id, PostRequestDto requestDto){
        Post post = getPostById(id);
        post.setTitle(requestDto.getTitle());
        post.setContent(requestDto.getContent());
        post.setAuthor(requestDto.getAuthor());
        post.setCategory(requestDto.getCategory());
        return postRepository.save(post);
    }


    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

}
