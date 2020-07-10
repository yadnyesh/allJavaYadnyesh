package io.yadnyesh.udemy.funcreactmodern;

public class LambdaExample {
    public static void main(String[] args) {
        MyFunInterface myFunInterface = () -> System.out.println("hello");
        myFunInterface.myMethod();
    }
}
