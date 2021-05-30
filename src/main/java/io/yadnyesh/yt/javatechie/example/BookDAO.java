package io.yadnyesh.yt.javatechie.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102,"Hibernate",800));
        books.add(new Book(103,"DS & Algo",263));
        books.add(new Book(104,"Spring Boot",455));
        return books;
    }
}
