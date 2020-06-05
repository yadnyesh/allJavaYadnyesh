package io.yadnyesh.yt.streams;

import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Al", "Ankit", "Noopur", "Payal", "Supriya", "Soma", "Sarika", "Hans", "Shivika", "Yogesh",
                          "Abhinandan", "Suresh", "Aditya", "Rakesh", "Shital");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("s"))
                .forEach(System.out::println);

        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map( x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}
