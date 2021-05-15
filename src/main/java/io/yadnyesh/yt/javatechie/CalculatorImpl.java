package io.yadnyesh.yt.javatechie;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorImpl {

  public static void main(String[] args) {

      Calculator calculator = Integer::sum;

      log.info(String.valueOf(calculator.add(2,3)));

  }

}
