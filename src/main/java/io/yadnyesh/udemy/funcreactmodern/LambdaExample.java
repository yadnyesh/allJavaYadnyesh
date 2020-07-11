package io.yadnyesh.udemy.funcreactmodern;

public class LambdaExample {
    public static void main(String[] args) {
        Name name = () -> System.out.println("Yadnyesh, hello from Lambda SAM");
        name.myName();
    }
}
