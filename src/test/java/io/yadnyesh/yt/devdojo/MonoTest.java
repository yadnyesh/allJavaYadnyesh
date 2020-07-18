package io.yadnyesh.yt.devdojo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.reactivestreams.Subscription;
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

    @Test
    public void monoSubscribeConsumerComplete(){
        String name = "Yadnyesh";
        Mono<String> mono = Mono.just(name)
                .log()
                .map(String::toUpperCase);
        mono.subscribe(s -> log.info("Value: {}", s),
                Throwable::printStackTrace,
                () -> log.info("Process Completed"));

        log.info("----------------------------------------");

        StepVerifier.create(mono)
                .expectNext("Yadnyesh".toUpperCase())
                .verifyComplete();
    }

    @Test
    public void monoSubscribeConsumerSubscription(){
        String name = "Yadnyesh";
        Mono<String> mono = Mono.just(name)
                .log()
                .map(String::toUpperCase);
        mono.subscribe(s -> log.info("Value: {}", s),
                Throwable::printStackTrace,
                () -> log.info("Process Completed"),
                subscription -> subscription.request(5));

        log.info("----------------------------------------");

        StepVerifier.create(mono)
                .expectNext("Yadnyesh".toUpperCase())
                .verifyComplete();
    }

    @Test
    public void monoDoOnMethods(){
        String name = "Yadnyesh";
        Mono<Object> mono = Mono.just(name)
                .log()
                .map(String::toUpperCase)
                .doOnSubscribe(subscription -> log.info("Subscribed"))
                .doOnRequest(longNumber -> log.info("Request received, start doing something"))
                .doOnNext(s -> log.info("Value is here. Executing doOnNext {}", s))
                .flatMap(s -> Mono.empty())
                .doOnNext(s -> log.info("Value is here. Executing doOnNext {}", s))
                .doOnSuccess(s -> log.info("doOnSuccess executed"));

        mono.subscribe(s -> log.info("Value: {}", s),
                Throwable::printStackTrace,
                () -> log.info("Process Completed"));

        log.info("----------------------------------------");

//        StepVerifier.create(mono)
//                .expectNext("Yadnyesh".toUpperCase())
//                .verifyComplete();
    }
}
