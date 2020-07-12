package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class PracticePredicate {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);

        List<String > list = new ArrayList<>();
        list.add("Yadnyesh");
        list.add("");
        list.add("Zuari");
        list.add("Oracle");
        list.add("");
        list.add("Opus");
        list.add("");
        list.add("Target");
        list.add("");
        list.add("WalmartLabs");

        Predicate<String> predicate = s -> s.contains("ar") && !s.isEmpty();
        Predicate<Integer> evenIntegerPredicate = i -> i%2 ==0;

        List<String> nonEmptyStringList = filterlist(list, predicate);
        List<Integer> evenIntegers = returnEvenIntgers(integerList, evenIntegerPredicate);

        log.info("The filtered list is: " + nonEmptyStringList);
        log.info("The list of even numbers is: " + evenIntegers);
    }

    private static <T> List<T> filterlist(List<T> listInput, Predicate<T> predicate) {
        List<T> list = new ArrayList<>();
        for(T string : listInput) {
            if(predicate.test(string)) {
                list.add(string);
            }
        }
        return list;
    }

    private static List<Integer> returnEvenIntgers(List<Integer> listInput, Predicate predicate) {
        List<Integer> list = new ArrayList<>();
        for(Integer i : listInput) {
            if(i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
