package io.yadnyesh.yt.misc;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class GenericsExample {
    public static void main(String[] args) {
        GenericPrinter<Integer> genericPrinter = new GenericPrinter<>(10);
        genericPrinter.print();

        ArrayList<String> cats = new ArrayList<>();
        cats.add("Cat 1");
        cats.add("Cat 2");
        cats.add("Cat 3");
        cats.add("Cat 4");
        log.info(String.valueOf(cats.size()));
    }
}
