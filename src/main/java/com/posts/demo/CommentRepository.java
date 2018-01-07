package com.posts.demo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CommentRepository extends ReactiveMongoRepository<Comment, String> {

  Flux<Comment> findAllCommentsByPostId(String postId, Pageable pageable);

  Flux<Comment> findAllCommentsByPostId(String postId);

  Mono<Long> countCommentsByPostId(String postId);
}
