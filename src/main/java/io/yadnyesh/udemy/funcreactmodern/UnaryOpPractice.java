package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.UnaryOperator;

@Slf4j
public class UnaryOpPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        UnaryOperator<Integer> unaryOperator = i -> i * 100;
        mapper(list, unaryOperator);
        
    }

    private static <T> void mapper(List<T> list, UnaryOperator<T> unaryOperator) {
        for(T number : list) {
            log.info("The mapped number is: " + unaryOperator.apply(number));
        }
    }
}
