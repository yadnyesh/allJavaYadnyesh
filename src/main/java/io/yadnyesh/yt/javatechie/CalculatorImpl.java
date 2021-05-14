package io.yadnyesh.yt.javatechie;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorImpl {

  public static void main(String[] args) {
    Calculator calculator = (a,b) -> log.info("Adding numbers on the calc..." + (a+b));
    calculator.switchOn(2,3);

  }

}
