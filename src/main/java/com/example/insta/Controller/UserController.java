package com.example.insta.Controller;

import com.example.insta.Entity.Users;
import com.example.insta.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    private Users submitUser(@RequestBody Users users) {
        return userService.submitMetaDataOfUser(users);
    }

    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId) {
        return userService.displayUserMetaData(userId);
    }
}
