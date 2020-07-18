package io.yadnyesh.yt.devdojo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.time.Duration;
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

        flux.subscribe(new Subscriber<>() {

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
                if (count >= requestCount) {
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

    @Test
    public void FluxSubscriberNumberNotSoUglyBackPressure() {
        Flux<Integer> flux = Flux.range(1,10)
                .log();

        flux.subscribe(new BaseSubscriber<>() {

            private int count = 0;
            private final int requestCount = 2;

            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                request(requestCount);
            }

            @Override
            protected void hookOnNext(Integer value) {
                count++;
                if (count >= requestCount) {
                    count = 0;
                    request(requestCount);
                }
            }
        });

        log.info("----------------------------------------");

        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5,6,7,8,9,10)
                .verifyComplete();
    }

    @Test
    public void FluxSubscriberInterval() {
        StepVerifier.withVirtualTime(this::createInterval)
                .expectSubscription()
                .expectNoEvent(Duration.ofDays(1))
                .thenAwait(Duration.ofDays(1))
                .expectNext(0L)
                .thenAwait(Duration.ofDays(1))
                .expectNext(1L)
                .thenCancel()
                .verify();
    }

    @Test
    public void FluxSubscriberIntervalAnotherImplementation() {
        StepVerifier.withVirtualTime(this::createInterval)
                .expectSubscription()
                .expectNoEvent(Duration.ofDays(1))
                .thenAwait(Duration.ofDays(1))
                .expectNext(0L)
                .thenAwait(Duration.ofDays(1))
                .expectNext(1L)
                .thenCancel()
                .verify();
    }

    private Flux<Long> createInterval() {
        return Flux.interval(Duration.ofDays(1))
                .log();
    }

    @Test
    public void fluxSubscriberPrettyBackPressure(){
        Flux<Integer> flux = Flux.range(1, 10)
                .limitRate(3)
                .log();

        flux.subscribe(i -> log.info("Number {}", i));

        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5,6,7,8,9,10)
                .verifyComplete();
    }

    @Test
    public void connectableFlux() {
        ConnectableFlux<Integer> connectableFlux = Flux.range(1, 10)
                .log()
                .delayElements(Duration.ofMillis(100))
                .publish();

        StepVerifier
                .create(connectableFlux)
                .then(connectableFlux::connect)
                .thenConsumeWhile(i -> i <= 5)
                .expectNext(6,7,8,9,10)
                .expectComplete()
                .verify();
    }
}
