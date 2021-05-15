package io.yadnyesh.yt.javatechie;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculatorImpl {

  public static void main(String[] args) {

      Calculator calculator = (a,b) -> {
        if(a < b) {
          throw new RuntimeException("Please enter a greater number followed by a smaller number");
        } else {
          return a -b;
        }
      };

      log.info(String.valueOf(calculator.subtract(20,3)));

  }

}
