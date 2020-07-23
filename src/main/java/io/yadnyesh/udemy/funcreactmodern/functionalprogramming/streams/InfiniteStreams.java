package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import java.util.stream.Stream;

public class InfiniteStreams {
  public static void main(String[] args) {
      Stream.iterate(0, i -> i - 1)
              .limit(15)
              .forEach(System.out::println);
  }
}
