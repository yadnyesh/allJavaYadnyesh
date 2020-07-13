package io.yadnyesh.udemy.funcreactmodern.lambda;

public class LambdaUnderTheHood {
    public static void main(String[] args) {
        MyFunInterface funInterface = new MyFunInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation 1");
            }
        };

        MyFunInterface funInterface2 = new MyFunInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation 2");
            }
        };

        MyFunInterface funcLambda = () -> System.out.println("Lightweight");
    }
}
