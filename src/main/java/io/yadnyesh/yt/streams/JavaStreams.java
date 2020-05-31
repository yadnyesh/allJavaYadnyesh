package io.yadnyesh.yt.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        Stream.of("Bharat", "Sweta", "Yadnyesh", "Bindiya", "Varada")
                .sorted()
                .forEach(System.out::println);
    }
}
