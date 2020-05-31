package io.yadnyesh.yt.streams;

import java.util.Arrays;

public class JavaStreams {
    public static void main(String[] args) {
        String[] names = {"Al", "Ankit", "Noopur", "Payal", "Supriya", "Soma", "Sarika", "Hans", "Shivika", "Yogesh",
                          "Abhinandan", "Suresh", "Aditya", "Rakesh", "Shital"};
        Arrays.stream(new int[] {1,2,3,4,5,6,7})
                .map(x -> x*2)
                .sorted()
                .forEach(System.out::println);
    }
}
