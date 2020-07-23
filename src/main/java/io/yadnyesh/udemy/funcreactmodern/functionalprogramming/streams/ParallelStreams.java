package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ParallelStreams {
  public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
    for (int i =0; i < 1000; i++) {
        employeeList.add(new Employee("John", 20000));
        employeeList.add(new Employee("Rohn", 3000));
        employeeList.add(new Employee("Tom", 15000));
        employeeList.add(new Employee("Bheem", 8000));
        employeeList.add(new Employee("Shiva", 200));
        employeeList.add(new Employee("Krishna", 50000));
    }

    long startTime = System.currentTimeMillis();
    log.info(String.valueOf(employeeList.stream().filter(e -> e.getSalary() > 1000).count()));
    long endTime = System.currentTimeMillis();

    log.info("Time take with Sequential Streams : " + (endTime - startTime));

    long pStartTime = System.currentTimeMillis();
    log.info(String.valueOf(employeeList.parallelStream().filter(e -> e.getSalary() > 1000).count()));
    long pEndTime = System.currentTimeMillis();

    log.info("Time take with Parallel Streams : " + (pEndTime - pStartTime));
  }
}
