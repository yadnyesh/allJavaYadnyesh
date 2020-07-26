package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Slf4j
public class CustomCollector {

  public static void main(String[] args) {
      List<Integer> numbers = List.of(2,6,8,9,0,1,52,5,61,8,9,96,0,18,23);
      Collector<Integer, List<Integer>, List<Integer>> toList = Collector.of(ArrayList::new,
              (list, e) -> list.add(e),
              (list1, list2) -> {list1.addAll(list2);
                  return list1;
              },
              Collector.Characteristics.IDENTITY_FINISH);
      numbers.stream()
              .filter(e -> e % 2 == 0)
              .collect(Collectors.toList())
              .forEach(e -> log.info(e.toString()));

  }


}
