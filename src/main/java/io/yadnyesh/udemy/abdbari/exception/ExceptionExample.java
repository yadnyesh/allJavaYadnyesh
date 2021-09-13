package io.yadnyesh.udemy.abdbari.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;

        try{
            c = a/b;
        } catch (ArithmeticException ae) {
            log.info("Exception: " + ae.getMessage());
        }
        log.info("Program continues post exception");
    }

}
