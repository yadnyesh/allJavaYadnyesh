package io.yadnyesh.yt.amigoscode.javafunctionalprogramming;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
public class _Function {
    public static void main(String[] args) {
        log.info(String.valueOf(incrementByOneFunction.apply(7)));
        log.info(String.valueOf(incrementByOneFunction));
        log.info(String.valueOf(incrementByOneFunction.andThen(multiplyBy10Function).apply(10)));

        Function<Integer, Integer> addBy1ThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        log.info(String.valueOf(addBy1ThenMultiplyBy10.apply(110)));



    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;





}
