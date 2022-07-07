package io.yadnyesh.offline;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CreateMapFromListOfStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "three", "two", "seven", "ten","eleven", "four");
        Map<Double, String> mapFromStringList = stringList.stream().collect(Collectors.toMap(a -> (Math.random()*100000), Function.identity()));
        System.out.println(mapFromStringList.toString());
    }
}
