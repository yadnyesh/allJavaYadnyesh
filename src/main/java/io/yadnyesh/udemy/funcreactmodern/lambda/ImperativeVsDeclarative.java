package io.yadnyesh.udemy.funcreactmodern.lambda;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

@Slf4j
@Data
public class ImperativeVsDeclarative {

    public static void main(String[] args) {
        int sumOfEvens = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                sumOfEvens = sumOfEvens + i;
            }
        }
        log.info("The Sum of Evens is: " + sumOfEvens);


        sumOfEvens = IntStream.rangeClosed(0, 100)
                .filter(i -> i%2 == 0)
                .reduce((x,y) -> x+y)
                .getAsInt();

        log.info("The Sum of Evens with Functional: " + sumOfEvens);
    }

}
