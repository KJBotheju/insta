package com.example.insta.Controller;

import com.example.insta.Entity.Comments;
import com.example.insta.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentsService commentsService;

    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comment) {
        return commentsService.submitCommentToDB(comment);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postId") String postId){
        return commentsService.getAllCommentsForDB(postId);
    }

}
