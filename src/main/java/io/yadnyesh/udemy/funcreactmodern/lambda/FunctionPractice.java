package io.yadnyesh.udemy.funcreactmodern.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Slf4j
public class FunctionPractice {
    public static void main(String[] args) {
        List<String> list = List.of("kit", "katrina", "shake");
        Function<String, Integer> function = String::length;
        List<Integer> newList = map(list, function);
        log.info(newList.toString());
    }

    private static <T, R> List<R> map(List<T> list, Function<T,R> function) {
        List<R> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(function.apply(e));
        }
        return newList;
    }
}
