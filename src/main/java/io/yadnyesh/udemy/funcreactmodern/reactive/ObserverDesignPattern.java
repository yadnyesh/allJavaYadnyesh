package io.yadnyesh.udemy.funcreactmodern.reactive;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverDesignPattern {
    public static void main(String[] args) {
        Book book = new Book("Goosebumops","Horror", "xyz", 200.00, "SoldOut");
        EndUser userBob = new EndUser("Bob", book);
        EndUser userRob = new EndUser("Rob", book);
        log.info(book.getInStock());
        book.setInStock("In Stock");
    }
}
