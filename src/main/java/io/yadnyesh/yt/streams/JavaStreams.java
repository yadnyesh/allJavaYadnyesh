package io.yadnyesh.yt.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
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

        Stream<String> rows = Files.lines(Paths.get("/Users/y0j01bf/learning/allJavaYadnyesh/src/main/java/io/yadnyesh/yt/streams/data.txt"));
        Map<String, Integer> mapFromFileInput;
        mapFromFileInput = rows
                            .map(x -> x.split(","))
                            .filter(x -> x.length ==3)
                            .collect(Collectors.toMap(x -> x[0], x-> Integer.parseInt(x[1])));
        rows.close();
        for(String key: mapFromFileInput.keySet()) {
            System.out.println(key + " --- " + mapFromFileInput.get(key));
        }


    }
}
