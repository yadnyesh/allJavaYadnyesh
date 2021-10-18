package io.yadnyesh.yt.javatechie.completeablefuture;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

@Slf4j
public class ConstraintsOfFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> listFuture = executorService.submit(() -> {
            log.info("Thread -> " + Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1,2,3,4);
        });

        List<Integer> integerList = listFuture.get();
        log.info(integerList.toString());

    }

    private static void delay(int min) {
        try {
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
