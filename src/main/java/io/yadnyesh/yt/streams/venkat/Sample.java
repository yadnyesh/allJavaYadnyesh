package io.yadnyesh.yt.streams.venkat;

import java.util.Arrays;
import java.util.List;

public class Sample {

    public static int transform(int number) {
        return number * 1;
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        System.out.println(integerList.stream()
            .filter(e -> e%2 ==0)
            .mapToInt(e -> e * 2)
            .sum()
        );
    }
}
