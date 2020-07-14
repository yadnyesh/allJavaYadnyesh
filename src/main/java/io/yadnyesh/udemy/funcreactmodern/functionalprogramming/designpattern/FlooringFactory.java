package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.designpattern;

import java.util.function.Supplier;

public class FlooringFactory {

    public static Flooring getFlooring(int minTemprature, int maxTemprature) {
        Supplier<Flooring> flooring;
        if(minTemprature <= 5 && maxTemprature <=20) {
            flooring = WoodenFlooring::new;
        } else if(minTemprature <= 5 && maxTemprature >=45) {
            flooring = CorkFlooring::new;
        } else {
            flooring = ConcreteFlooring::new;
        }
        return flooring.get();
    }
}
