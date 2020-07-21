package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class LazinessDemo {
  public static void main(String[] args) {
      List<Book> books = new ArrayList<>();
      books.add(new Book("H1", "A1", "Horror",5));
      books.add(new Book("H2", "A2", "Thriller",1));
      books.add(new Book("H3", "A3", "Horror",1));
      books.add(new Book("H4", "A4", "Thriller",1));

      Stream<Book> bookStream = books.stream()
              .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
              .peek(book -> log.info("Filtered Book is: {}",book ))
              .filter((book) -> book.getRating() > 3);
      collect(bookStream);

  }

    private static void collect(Stream<Book> bookStream) {
      List<Book> popularHorrorBooks = bookStream.collect(Collectors.toList());
      log.info(popularHorrorBooks.toString());
    }
}
