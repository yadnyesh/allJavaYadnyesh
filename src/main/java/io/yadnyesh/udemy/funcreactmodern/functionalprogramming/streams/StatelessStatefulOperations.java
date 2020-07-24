package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StatelessStatefulOperations {
  public static void main(String[] args) {
      List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      List<Integer> collect = integerList.parallelStream().skip(2).limit(5).collect(Collectors.toList());
      log.info(collect.toString());
  }
}
