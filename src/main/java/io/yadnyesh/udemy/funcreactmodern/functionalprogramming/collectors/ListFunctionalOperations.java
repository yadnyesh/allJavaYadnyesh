package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
public class ListFunctionalOperations {

  public static void main(String[] args) {
      String bollywood = "Bollywood";
      String hollywood = "Hollywood";

      List<Movie> movies = Arrays.asList(
              new Movie("Spotlight",2015,hollywood),
              new Movie("Avengers",2018,hollywood),
              new Movie("Avatar",2010,hollywood),
              new Movie("Chor",2020, bollywood),
              new Movie("Karma",1984, bollywood),
              new Movie("Mein",1996, bollywood)
      );
      movies.forEach(e -> log.info(e.toString()));
      movies.sort((o1, o2) -> o2.getReleaseYear() - o1.getReleaseYear());
      movies.forEach(e -> log.info("After Sorting: {}", e.toString()));
      movies.stream().map(Movie::getName).forEach(log::info);
      Optional<String> moviesString = movies.stream()
              .map(Movie::getName)
              .reduce((m1, m2) -> m1 + " | " + m2);
      log.info(String.valueOf(moviesString));
  }
}
