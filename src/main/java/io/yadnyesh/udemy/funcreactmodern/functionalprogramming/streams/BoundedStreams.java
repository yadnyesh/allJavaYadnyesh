package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Slf4j
public class BoundedStreams {
  public static void main(String[] args) {
      List<Integer> integerList = List.of(1, 4, 5, 6, 7, 8, 9, 10);
      Map<Integer, String> map = Map.of(1,"one", 2, "two", 3, "three",4,"four");

      Stream<String> streamVaues = map.values().stream();
      streamVaues.forEach(log::info);
      Stream<Integer> keyStream = map.keySet().stream();
      keyStream.forEach(k -> log.info(k.toString()));


  }
}
