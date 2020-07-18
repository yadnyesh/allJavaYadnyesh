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
}
