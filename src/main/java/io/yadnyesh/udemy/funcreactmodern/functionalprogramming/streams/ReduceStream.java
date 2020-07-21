package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class ReduceStream {
  public static void main(String[] args) {
      Integer reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
              .reduce(0, Integer::sum);
      log.info(reduce.toString());
  }
}

