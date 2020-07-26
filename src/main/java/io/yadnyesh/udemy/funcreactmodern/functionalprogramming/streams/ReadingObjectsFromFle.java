package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Slf4j
public class ReadingObjectsFromFle {
  public static void main(String[] args) {
      Path path = Paths.get("/Users/y0j01bf/learning/allJavaYadnyesh/src/main/java/io/yadnyesh/udemy/funcreactmodern/functionalprogramming/streams/Books");
      try {
          Stream<String> lines = Files.lines(path);
          Spliterator<String> baseSpliterator = lines.spliterator();
          Spliterator<Book> spliterator = new BookSpliterator(baseSpliterator);
          StreamSupport.stream(spliterator,false).forEach(book -> log.info(book.toString()));
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}
