package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.Consumer;

@Slf4j
public class ConsumerPractice {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(34,56,57,48,25,65,53,12,13);
        Consumer <Integer> consumer = e -> log.info(e.toString());
        consumer.accept(56);
        printElements(integerList, consumer);
    }

    private static <T> void printElements(List<T> integerList, Consumer<T> consumer) {
        for (T t : integerList) {
            consumer.accept(t);
        }
    }
}
