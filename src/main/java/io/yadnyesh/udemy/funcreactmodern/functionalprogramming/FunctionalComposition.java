package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionalComposition {
    public static void main(String[] args) {

        Function<Square, Integer> function1 = Square::getArea;
        Function<Integer, Double> function2 = Math::sqrt;

        Function<Square, Double> getSide = function2.compose(function1);
        Square s = new Square();
        s.setArea(100);

        Double side = getSide.apply(s);
        log.info(side.toString());
    }
}
