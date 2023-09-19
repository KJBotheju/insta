package com.example.insta.Repository;

import com.example.insta.Entity.Comments;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CommentRepo extends CrudRepository<Comments,Integer> {
    Comments save(Comments comment);
    ArrayList<Comments> findAllByPostId(String postId);
    ArrayList<Comments> findAll();
}
