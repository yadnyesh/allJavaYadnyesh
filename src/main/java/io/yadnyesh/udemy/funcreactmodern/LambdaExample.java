package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaExample {
    public static void main(String[] args) {
        Name name = () -> log.info("Yadnyesh, hello from Lambda SAM");
        name.myName();

        MathOperation add = (a , b) -> log.info("The sum of numbers is: " + (a+b));
        MathOperation subtract = (a, b) -> log.info("The difference is: " + (a - b));
        add.operation(10,3);
        subtract.operation(13, 10);

    }
}