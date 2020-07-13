package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s);

        c1.accept("Hello C1");
        c2.accept("Hello C3s");

        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("From yad consumer Basics String");

        Function<Integer, Integer> f1 = s -> s+2;
        Function<Integer, Integer> f2 = s -> s*2;
        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }
}
