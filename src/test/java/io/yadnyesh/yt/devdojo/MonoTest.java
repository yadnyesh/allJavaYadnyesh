package io.yadnyesh.yt.devdojo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.List;

@Slf4j
public class MonoTest {
    @Test
    public void test(){
        String name = "Yadnyesh";
        //List<String> stringList = List.of("Yadnyesh", "Bharat", "Juvekar");
        Mono<String> mono = Mono.just(name).log();
        mono.subscribe();

        log.info("----------------------------------------");

        StepVerifier.create(mono)
                .expectNext("Yadnyesh")
                .verifyComplete();
    }

    @Test
    public void monoSubscribeConsumer(){
        String name = "Yadnyesh";
        Mono<String> mono = Mono.just(name).log();
        mono.subscribe(s -> log.info("Value: {}", s));

        log.info("----------------------------------------");

        StepVerifier.create(mono)
                .expectNext("Yadnyesh")
                .verifyComplete();
    }

    @Test
    public void monoSubscribeConsumerError(){
        String name = "Yadnyesh";
        Mono<String> mono = Mono.just(name).map(s -> {throw new RuntimeException("Testing Mono with error");});
        mono.subscribe(s -> log.info("Value: {}", s), s -> log.error("Some Error Occurred"));
        mono.subscribe(s -> log.info("Value: {}", s), Throwable::printStackTrace);

        log.info("----------------------------------------");

        StepVerifier.create(mono)
                .expectNext("Yadnyesh")
                .verifyComplete();
    }
}
