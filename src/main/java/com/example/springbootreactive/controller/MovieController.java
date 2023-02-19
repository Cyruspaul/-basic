package com.example.springbootreactive.controller;


import com.example.springbootreactive.domain.Movie;
import com.example.springbootreactive.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    
    
    @RequestMapping("/{id}")
    Mono<Movie> getmoviebyId(@PathVariable String id){
        System.out.println(id);
        System.out.println(movieService.getMovieById(id).hasElement());
        return movieService.getMovieById(id);
    }

    @RequestMapping("/all")
    Flux<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

}
