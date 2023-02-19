package com.example.springbootreactive.repository;


import com.example.springbootreactive.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
