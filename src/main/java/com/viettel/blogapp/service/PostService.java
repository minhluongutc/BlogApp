package com.viettel.blogapp.service;

import com.viettel.blogapp.payload.PostDto;
import com.viettel.blogapp.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDTO);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);
}
