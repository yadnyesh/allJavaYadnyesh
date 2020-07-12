package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiFunction;

@Slf4j
public class BiFunctionPractice {

    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (a, b) -> (a + b).length();
        log.info(biFunction.apply("Basics ","Strong").toString());
    }
}
