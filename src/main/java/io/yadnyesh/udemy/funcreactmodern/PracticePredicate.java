package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class PracticePredicate {

    public static void main(String[] args) {
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

        List<String> nonEmptyStringList = filterlist(list, predicate);

        log.info("The filtered list is: " + nonEmptyStringList);
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
}
