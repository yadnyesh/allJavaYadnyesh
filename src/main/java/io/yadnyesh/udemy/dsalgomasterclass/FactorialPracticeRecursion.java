package io.yadnyesh.udemy.dsalgomasterclass;

public class FactorialPracticeRecursion {

    public static int factorialRecursion(int n) {
        if ( n == 0  || n ==1) {
            return 1;
        }

        return n * factorialRecursion(n-1);
    }


    public static int factorialLoop(int n) {
        int sum = 1;

        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nFactorial = factorialRecursion(5);
        int nFactorialInLoop = factorialLoop(5);
        System.out.println(nFactorialInLoop);
    }
}
