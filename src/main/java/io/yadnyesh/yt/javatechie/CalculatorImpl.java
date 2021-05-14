package io.yadnyesh.yt.javatechie;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorImpl {

  public static void main(String[] args) {
    Calculator calculator = () -> log.info("Switching on the calc...");
    calculator.switchOn();
  }

}
