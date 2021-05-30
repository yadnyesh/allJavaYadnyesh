package io.yadnyesh.yt.javatechie.example;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class BookService {

    public List<Book> getBooksInSortedOrder() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new Comparator<Book>(){

            @Override
            public int compare(Book o1, Book o2) {
                return -1;
            }
        });
        return books;
    }

    public static void main(String[] args) {
        log.info(new BookService().getBooksInSortedOrder().toString());
    }
}

class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
