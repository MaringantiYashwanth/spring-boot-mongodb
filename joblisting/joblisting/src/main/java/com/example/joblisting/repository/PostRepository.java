package com.example.joblisting.repository;

import com.example.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
