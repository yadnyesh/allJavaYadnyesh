package io.yadnyesh.udemy.funcreactmodern.reactive;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Book implements SubjectLibrary{
    private String name;
    private String type;
    private String author;
    private double price;
    private String inStock;
    private ArrayList<Observer> obsList = new ArrayList<>();

    public Book(String name, String type, String author, double price, String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public ArrayList<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(ArrayList<Observer> obsList) {
        this.obsList = obsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        log.info("Availabiltiy changed from Sold out to in stock");
        notifyObserver();
    }

    @Override
    public void subscribeObserver(Observer ob) {
        obsList.add(ob);
    }

    @Override
    public void ubsubscribeObserver(Observer ob) {
        obsList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        log.info("Book{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", inStock='" + inStock +
                '}');
        for (Observer o : obsList) {
            o.update(this.inStock);
        }
    }
}
