package com.eadcw.feedpost;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:5173")
public class PostController {

  private final PostService postService;
  @GetMapping("/")
  public List<PostResponse> getAllPosts(){
    return postService.getAllPosts();
  }

  @GetMapping("/{id}")
  public PostResponse getPostById(@PathVariable("id") String id){
    return postService.getPostById(id);
  }

  @PostMapping("/")
  public Post createPost(@RequestBody Post post) {

    return postService.createPost(post);
  }

}
