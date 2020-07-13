package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TailCallOptimization {
    public static void main(String[] args) {
        log.info(String.valueOf(reFact(5)));
        log.info(String.valueOf(tailRecursiveFactorial(5, 0)));
    }

    public static long reFact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * reFact(n -1);
    }

    public static long tailRecursiveFactorial(int n, int a) {
        if (n <= 1)
            return 1;
        else
            return n * tailRecursiveFactorial(n -1, n * a);
    }
}
