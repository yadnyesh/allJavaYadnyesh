package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        Burger myOrder = new BurgerShop(burger -> burger.addVeggies()).use(new Burger());
        System.out.println("You get: " + myOrder);
    }
}
