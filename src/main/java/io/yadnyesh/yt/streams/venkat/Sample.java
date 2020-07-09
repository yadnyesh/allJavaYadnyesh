package io.yadnyesh.yt.streams.venkat;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

public class Sample {

    public static int transform(int number) {
        System.out.println("t : " + number + " -- " + Thread.currentThread());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList.stream()
                .parallel()
                .map(Sample::transform)
                .forEachOrdered(e -> System.out.println(e + " " + Thread.currentThread().getName()));
    }
}
