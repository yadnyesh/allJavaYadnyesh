package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
public class SetFuntionalOperations {
  public static void main(String[] args) {
      Set<Integer> set = Set.of(3,56,7,82,39);
      set.forEach(s -> log.info(s.toString()));
      log.info("---------------------------");
      set.stream().sorted().forEach(s -> log.info(s.toString()));
      log.info("---------------------------");
      set.stream()
              .filter(e -> e%2 ==0)
              .forEach(e -> log.info(e.toString()));
      int sum = set.stream()
              .mapToInt(e -> e)
              .sum();
      log.info("Sum of the numbers is {}", sum);
  }
}
