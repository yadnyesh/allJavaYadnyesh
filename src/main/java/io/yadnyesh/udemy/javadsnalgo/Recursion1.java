package io.yadnyesh.udemy.javadsnalgo;

public class Recursion1 {

    public void foo(int n) {
        if (n < 0)
            return;
        else
            foo(n-1);
        System.out.println("Hello World " + n);
    }

    public int factorial(int n) {
        if ( n == 0) {
            return 1;
        } else {
            return ( n * factorial(n - 1));
        }
    }

    public int fibonacci(int n) {
        if(n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Recursion1 recursion1 = new Recursion1();
        recursion1.foo(3);
        System.out.println("Factorial is: " + recursion1.fibonacci(5));
    }
}
