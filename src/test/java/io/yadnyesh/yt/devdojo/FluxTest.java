package io.yadnyesh.yt.devdojo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
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

    @Test
    public void FluxSubscriberFromError() {
        Flux<Integer> flux = Flux.range(1,5)
                .log()
                .map(i -> {
                    if( i == 4) {
                        throw new IndexOutOfBoundsException("Induced index error");
                    }
                    return i;
                });
        flux.subscribe(i -> log.info("Number: {}", i), Throwable::printStackTrace,
                () -> log.info("Done!"), subscription ->  subscription.request(3));

        log.info("----------------------------------------");

        StepVerifier.create(flux)
                .expectNext(1,2,3)
                .expectError(IndexOutOfBoundsException.class)
                .verify();
    }

    @Test
    public void FluxSubscriberNumberUglyBackPressure() {
        Flux<Integer> flux = Flux.range(1,10)
                .log();

        flux.subscribe(new Subscriber<Integer>() {

            private int count = 0;
            private Subscription subscription;
            private int requestCount;

            @Override
            public void onSubscribe(Subscription subscription) {
                this.subscription = subscription;
                subscription.request(requestCount);
            }

            @Override
            public void onNext(Integer integer) {
                count++;
                if(count >= requestCount) {
                    count = 0;
                    subscription.request(requestCount);
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        });

        log.info("----------------------------------------");

        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5,6,7,8,9,10)
                .verifyComplete();
    }
}
