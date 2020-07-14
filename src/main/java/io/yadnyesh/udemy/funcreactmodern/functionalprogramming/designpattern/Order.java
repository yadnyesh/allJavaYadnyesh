package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import io.yadnyesh.udemy.funcreactmodern.functionalprogramming.Function;

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

    public static void place(Function<Order, Order> function) {
        Order order = new Order();
        order = function.apply(order);
        System.out.println("Order placed successfully!");
        System.out.println(order.cart.size() + "  items ordered by you will be delivered at " + order.address);
    }
}
