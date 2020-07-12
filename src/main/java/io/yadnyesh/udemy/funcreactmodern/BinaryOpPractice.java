package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BinaryOperator;

@Slf4j
public class BinaryOpPractice {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a, b) -> a + "." + b;
        log.info(binaryOperator.apply("BasicsStrong", "com"));
    }
}
