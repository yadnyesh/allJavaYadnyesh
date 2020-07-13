package io.yadnyesh.udemy.funcreactmodern.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
public class ConstructorReference {
    public static void main(String[] args) {
        log.info("Starting execution of the program: "  + Thread.currentThread().getName());
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable taskOne = () -> log.info("Task 1 completed"  + Thread.currentThread().getName());
        Runnable taskTwo = () -> log.info("Task 2 completed "  + Thread.currentThread().getName());
        Thread threadOne = threadGenerator.apply(taskOne);
        Thread threadTwo = threadGenerator.apply(taskTwo);
        threadOne.start();
        threadTwo.start();
        threadGenerator.apply(() -> log.info("Compact Form" + Thread.currentThread().getName())).start();
    }
}
