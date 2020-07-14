package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order() {
    }

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order add(String item) {
        cart.add(item);
        System.out.println(item + " is successfully added to your cart.");
        return new Order(this.cart, this.address);
    }

    public Order deliverAt(String location) {
        this.address = location;
        System.out.println("The desired delivery address is: " + location);
        return new Order(this.cart, this.address);
    }

    public void place() {
        System.out.println("Order placed successfully!");
        System.out.println(this.cart.size() + "  items ordered by you will be delivered at " + this.address);
    }
}
