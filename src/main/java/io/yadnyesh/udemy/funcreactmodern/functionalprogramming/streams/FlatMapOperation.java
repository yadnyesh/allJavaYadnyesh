package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class FlatMapOperation {

    public static void main(String[] args){
        Stream<String> a = Stream.of("Hello! ", "there");
        Stream<String> b = Stream.of("Learning ", "Java?");
        Stream<Stream<String>> streamStream = Stream.of(a, b);
        Stream.of(a,b).flatMap(e -> e).forEach(log::info);
    }
}
