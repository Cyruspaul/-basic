package com.example.springbootreactive.bootstrap;


import com.example.springbootreactive.domain.Movie;
import com.example.springbootreactive.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class InitMovies implements CommandLineRunner {

    private final MovieRepository repository;

    @Override
    public void run(String... args) throws Exception {
            repository.deleteAll()
                    .thenMany(
                            Flux.just(
                                  "Silence of the Lambdas","Aeeon Flus", "Enter the Mono<Void>", "bsck to the future"
                            ).map(Movie::new)
                            .flatMap(repository::save)
                    ).subscribe(null, null, ()->{
                        repository.findAll().subscribe(System.out::println);
            });
    }
}
