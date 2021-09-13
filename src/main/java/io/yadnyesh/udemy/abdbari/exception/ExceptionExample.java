package io.yadnyesh.udemy.abdbari.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionExample {

    public static void main(String[] args) throws MinBalException {
        float c;

        int my_int_array[] = {10, 20, 40, 50, 60, 0};

        try{
            c = my_int_array[1]/my_int_array[5];
            log.info("Result of Division is: " + c);
        } catch (ArithmeticException ae) {
            throw new MinBalException();
        } catch (ArrayIndexOutOfBoundsException aoob) {
            log.info("Exception: " + aoob.getMessage());
        }
        log.info("Program continues post exception");
    }

}
