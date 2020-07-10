package io.yadnyesh.udemy.funcreactmodern;

public class LambdaExample {
    public static void main(String[] args) {
//        MyFunInterface myFunInterface = () -> System.out.println("hello");
//        myFunInterface.myMethod();
        onTheFly(() -> System.out.println("Test"));
    }

    public static void onTheFly(MyFunInterface fun) {
        fun.myMethod();
    }
}
