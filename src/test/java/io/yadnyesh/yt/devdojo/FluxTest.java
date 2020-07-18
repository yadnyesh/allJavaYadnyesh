package io.yadnyesh.yt.devdojo;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

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
        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5)
                .verifyComplete();
    }
}
