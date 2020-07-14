package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Flooring floor = FlooringFactory.getFlooring(13, 50);
        floor.installation();
    }
}
