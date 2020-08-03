package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class ListFunctionalOperations {

  public static void main(String[] args) {
      List<Movie> movies = Arrays.asList(
              new Movie("Spotlight",2015,"Hollywood"),
              new Movie("Avengers",2018,"Hollywood"),
              new Movie("Avatar",2010,"Hollywood"),
              new Movie("Chor",2020,"Bollywood"),
              new Movie("Karma",1984,"Bollywood"),
              new Movie("Mein",1996,"Bollywood")
      );
      movies.forEach(e -> log.info(e.toString()));
  }
}
