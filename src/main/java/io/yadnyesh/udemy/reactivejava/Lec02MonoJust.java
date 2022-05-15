package io.yadnyesh.udemy.reactivejava;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class Lec02MonoJust {
    public static void main(String[] args) {

        Mono<Integer> mono = Mono.just(1);
        mono.subscribe(i -> log.info("Received {}", i));

    }
}
