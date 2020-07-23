package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

@Slf4j
public class Calculations {
  public static void main(String[] args) {
      int sum = IntStream.of(1,2,3,4,5,6,7,8).sum();
      log.info(String.valueOf(sum));

      OptionalInt maxOptional = IntStream.of().max();
      log.info(maxOptional.toString());

      IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
              .summaryStatistics();
      log.info(intSummaryStatistics.toString());
  }
}
