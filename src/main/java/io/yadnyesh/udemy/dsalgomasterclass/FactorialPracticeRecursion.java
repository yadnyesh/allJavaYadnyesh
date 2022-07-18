package io.yadnyesh.udemy.dsalgomasterclass;

public class FactorialPracticeRecursion {

    public static int factorial(int n) {
        if ( n == 0  || n ==1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int nFactorial = factorial(5);
        System.out.println(nFactorial);
    }
}
