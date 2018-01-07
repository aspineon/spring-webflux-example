package com.posts.demo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;


public interface PostRepository extends ReactiveMongoRepository<Post, String> {

  Flux<Post> findAllBy(Pageable pageable);
}


