package io.yadnyesh.yt.misc;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.ls.LSOutput;

@Slf4j
public class FibonacciInJava {
    public static void main(String[] args) {
      // 0, 1, 1, 2, 3, 5, 8, 13....
        log.info("0");
        log.info("1");
        int num1 = 1;
        int num2 = 0;
        int currentSum = 0;
        for(int i = 0; i < 10; i++) {
            currentSum = num1 + num2;
            num1 = num2;
            num2 = currentSum;
            log.info(String.valueOf(currentSum));
        }
        System.out.println(fibonacci(10));
    }

    static int num1 = 1;
    static int num2 = 0;
    static int currentSum = 0;

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            currentSum = num1 + num2;
            num1 = num2;
            num2 = currentSum;
            log.info(String.valueOf(currentSum));
            fibonacci(n -1);
        }
        return currentSum;
    }


}
