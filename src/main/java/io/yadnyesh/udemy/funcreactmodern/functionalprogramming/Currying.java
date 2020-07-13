package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Currying {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> function1 = u -> v -> u + v;
        log.info(function1.apply(1).apply(2).toString());
    }
}
