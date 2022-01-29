package io.yadnyesh.udemy.javadsnalgo;

public class Recursion1 {

    public void foo(int n) {
        if (n < 0)
            return;
        else
            foo(n-1);
        System.out.println("Hello World " + n);
    }

    public static void main(String[] args) {
        Recursion1 recursion1 = new Recursion1();
        recursion1.foo(3);
    }
}
