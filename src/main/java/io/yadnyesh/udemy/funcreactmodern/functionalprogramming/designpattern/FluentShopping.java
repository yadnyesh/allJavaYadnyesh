package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class FluentShopping {
    public static void main(String[] args) {
        new Order()
            .add("Shoes")
            .add("T-shirts")
            .deliverAt("#420, its not my address. 560001")
            .place();
    }
}
