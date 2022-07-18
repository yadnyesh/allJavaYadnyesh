package io.yadnyesh.udemy.dsalgomasterclass;

public class FactorialImpl {

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        FactorialImpl factorial = new FactorialImpl();
        System.out.println(factorial.factorial(5));
    }
}
