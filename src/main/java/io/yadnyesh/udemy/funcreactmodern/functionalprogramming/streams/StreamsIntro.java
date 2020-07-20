package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StreamsIntro {
  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("H1", "A1", "Horror",5));
    books.add(new Book("H2", "A2", "Thriller",1));
    books.add(new Book("H3", "A3", "Horror",1));
    books.add(new Book("H4", "A4", "Thriller",1));


    List<Book> popularHorrorBooks = new ArrayList<>();
    for (Book book : books) {
        if(book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3){
            popularHorrorBooks.add(book);
        }
    }
    log.info(popularHorrorBooks.toString());
  }
}
