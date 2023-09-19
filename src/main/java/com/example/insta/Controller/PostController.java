package com.example.insta.Controller;

import com.example.insta.Entity.Post;
import com.example.insta.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post) {
        return postService.submitPostToDataBase(post);
    }

    @GetMapping("")
    private ArrayList<Post> getAllPost(){
        return postService.retrivePostFromDB();
    }
}