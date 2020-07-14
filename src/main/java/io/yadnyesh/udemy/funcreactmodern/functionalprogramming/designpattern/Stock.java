package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

public class Stock {
    private String symbol;
    private double price;
    private int units;

    public Stock(String symbol, double price, int units) {
        this.symbol = symbol;
        this.price = price;
        this.units = units;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
    }
}
