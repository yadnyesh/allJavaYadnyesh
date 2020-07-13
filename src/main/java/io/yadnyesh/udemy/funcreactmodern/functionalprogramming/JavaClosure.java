package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaClosure {

    public static void main(String[] args) {
        int val = 111;
        Task lambda = () -> {
            log.info(String.valueOf(val));
            log.info("Task Completed");
        };
        printValue(lambda);
    }

    private static void printValue(Task lambda) {
        lambda.doTask();
    }


}
