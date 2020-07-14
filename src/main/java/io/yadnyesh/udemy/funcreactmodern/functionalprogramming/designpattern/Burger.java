package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class Burger {
    private String burgerType;

    public String getBurgerType() {
        return burgerType;
    }

    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger() {
        this.burgerType = "";
    }

    public Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addVeggies() {
        System.out.println("Adding Veggies to the Burger.");
        return new Burger(this.burgerType += "Veggies");
    }

    public Burger addCheese() {
        System.out.println("Adding Cheese to the Burger.");
        return new Burger(this.burgerType += "Cheese");
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                '}';
    }
}
