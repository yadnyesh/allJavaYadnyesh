package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Slf4j
public class CollectorsInAction {
  public static void main(String[] args) {
    Path path = Paths.get("/Users/y0j01bf/learning/allJavaYadnyesh/src/main/java/io/yadnyesh/udemy/funcreactmodern/functionalprogramming/collectors/EmployeeData.txt");
      try (Stream<String> lines = Files.lines(path);) {
          Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));
          Spliterator<String> wordSpliterator = words.spliterator();
          Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);
          Stream<Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);
          List<Employee> employeeList = employeeStream.collect(Collectors.toList());

          TreeSet<Employee> employeesSorted = new TreeSet<>(employeeList);
          employeesSorted.forEach(e -> log.info(e.toString()));

          Map<Integer, String> getNameById = employeesSorted.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
          log.info(getNameById.toString());

          Map<Boolean, List<Employee>> mapByGender = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getGender() == 'M'));
          log.info(mapByGender.toString());

          Map<String, List<Employee>> mapByDesignation = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDesignation()));
          log.info(mapByDesignation.toString());

      } catch (IOException e) {
          log.error(e.getMessage());
      }
  }
}
