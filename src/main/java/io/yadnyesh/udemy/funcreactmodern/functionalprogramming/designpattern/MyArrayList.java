package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import io.yadnyesh.udemy.funcreactmodern.functionalprogramming.Consumer;

public class MyArrayList {
    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer action) {
        for( int i = 0; i < elements.length; i++) {
            action.accept(elements[i]);
        }
    }
}
