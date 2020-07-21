package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class MapOperation {
  public static void main(String[] args) {
      Stream.of(1,2,3,4,5,6,7,8,9,10)
              .map(e -> e *5)
              .forEach(e -> log.info(e.toString()));

      List<Book> books = new ArrayList<>();
      books.add(new Book("H1", "A1", "Horror",5));
      books.add(new Book("H2", "A2", "Thriller",1));
      books.add(new Book("H3", "A3", "Horror",1));
      books.add(new Book("H4", "A4", "Thriller",1));

      books.stream()
              .map(e -> e.getName())
              .forEach(e -> log.info(e));
  }
}
