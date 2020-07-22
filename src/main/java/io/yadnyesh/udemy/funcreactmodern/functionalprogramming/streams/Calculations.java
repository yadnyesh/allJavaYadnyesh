package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

@Slf4j
public class Calculations {
  public static void main(String[] args) {
      IntStream sum = IntStream.of(1,2,3,4,5,6,7,8);
      log.info(String.valueOf(sum.sum()));
  }
}
