package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

@Slf4j
public class NumericStreams {
  public static void main(String[] args) {
      List<Book> books = new ArrayList<>();
      books.add(new Book("H1", "A1", "Horror",4.4));
      books.add(new Book("H2", "A2", "Thriller",4.1));
      books.add(new Book("H3", "A3", "Horror",2.67));
      books.add(new Book("H4", "A4", "Thriller",4.6));

      OptionalDouble averageRating = books.stream()
              .map(Book::getRating)
              .mapToDouble(rating -> rating)
              .average();

      log.info(("Average Rating: " + averageRating.toString()));

      IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
      log.info(intStream.toString());
      DoubleStream doubleStream = DoubleStream.of(11,12,13,14,15,16);
      log.info(doubleStream.toString());

  }
}
