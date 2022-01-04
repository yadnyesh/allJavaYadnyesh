package io.yadnyesh.yt.misc;

public class GenericsExample {
    public static void main(String[] args) {
        GenericPrinter<Integer> genericPrinter = new GenericPrinter<>(10);
        genericPrinter.print();
    }
}
