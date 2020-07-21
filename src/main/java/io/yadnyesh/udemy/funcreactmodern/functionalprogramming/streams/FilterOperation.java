package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class FilterOperation {
  public static void main(String[] args) {
    Stream.of(34, 678,89,4,67,89,34,65,42)
            .filter(i -> i%2 == 0)
            .forEach(e -> log.info(e.toString()));
  }
}
