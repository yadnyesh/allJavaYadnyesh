package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    System.out.println(Runtime.getRuntime().availableProcessors());
    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");
    System.out.println(ForkJoinPool.getCommonPoolParallelism());
    ForkJoinPool forkJoinPool = new ForkJoinPool(4);

      List<Employee> employeeList = new ArrayList<>();
      for (int i =0; i < 1000; i++) {
          employeeList.add(new Employee("John", 20000));
          employeeList.add(new Employee("Rohn", 3000));
          employeeList.add(new Employee("Tom", 15000));
          employeeList.add(new Employee("Bheem", 8000));
          employeeList.add(new Employee("Shiva", 200));
          employeeList.add(new Employee("Krishna", 50000));
      }

    long count = forkJoinPool.submit(() -> employeeList.parallelStream().filter(e -> e.getSalary() > 1000).count()).get();
    System.out.println(count);
  }
}
