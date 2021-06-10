package io.yadnyesh.yt.durgesh.collection.exceptionhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionExample {
  public static void main(String[] args) {
      try{
          int number1 = Integer.parseInt(args[0]);
          int number2 = Integer.parseInt(args[1]);
          log.info("The entered numbers are: " + number1 + " and " + number2);
          int result = number1/number2;
          log.info("Division is: " + result);
      } catch (ArithmeticException e){
          log.info("ArithmeticException..... " + e);
      } catch (NumberFormatException e) {
          log.info("NumberFormatException..... " + new AgeInvalidException(e.getMessage()));
      } catch (Exception e) {
          log.info("Exception: " + new AgeInvalidException(e.getMessage()));
      } finally{
          log.info("Finally block always get executed.");
      }
      log.info("After exception block");
  }
}
