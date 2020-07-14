package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class FluentShopping {
    public static void main(String[] args) {
        Order.place(order -> order.add("Shoes").add("Shirt").deliverAt("Street #420, Khopoli"));
    }
}
