package com.example.joblisting.controller;

import com.example.joblisting.repository.PostRepository;
import com.example.joblisting.models.Post;
import com.example.joblisting.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins="https://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository srepo;

    @CrossOrigin
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }
    @GetMapping("/post/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text) {
        return srepo.findByText(text);
    }
}
