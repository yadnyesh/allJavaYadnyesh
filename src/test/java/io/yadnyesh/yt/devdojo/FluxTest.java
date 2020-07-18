package io.yadnyesh.yt.devdojo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.List;

@Slf4j
public class FluxTest {

    @Test
    public void FluxSubscriber() {
        Flux<String> fluxString = Flux.just("FirstName", "LastName", "DevDojo", "Academy")
                .log();
        StepVerifier.create(fluxString)
                .expectNext("FirstName", "LastName", "DevDojo", "Academy")
                .verifyComplete();
    }

    @Test
    public void FluxSubscriberNumbers() {
        Flux<Integer> flux = Flux.range(1,5)
                .log();
        flux.subscribe(i -> log.info("Number: {}", i));
        log.info("----------------------------------------");
        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5)
                .verifyComplete();
    }

    @Test
    public void FluxSubscriberFromList() {
    Flux<Integer> flux = Flux.fromIterable(List.of(1,2,3,4,5)).log();
        flux.subscribe(i -> log.info("Number: {}", i));
        log.info("----------------------------------------");
        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5)
                .verifyComplete();
    }
}
