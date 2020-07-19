package io.yadnyesh.yt.devdojo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple3;

import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
public class Operators {

    @Test
    public void subscribeOnSimple() {
        Flux<Integer> flux = Flux.range(1, 4)
                .map(i -> {
                    log.info("Map 1 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                }).subscribeOn(Schedulers.boundedElastic())
                .map(i -> {
                    log.info("Map 2 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                });

        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext(1,2,3,4)
                .verifyComplete();
    }

    @Test
    public void publishOnSimple() {
        Flux<Integer> flux = Flux.range(1, 4)
                .map(i -> {
                    log.info("Map 1 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                }).publishOn(Schedulers.boundedElastic())
                .map(i -> {
                    log.info("Map 2 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                });
        flux.subscribe();
        flux.subscribe();
        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext(1,2,3,4)
                .verifyComplete();
    }

    @Test
    public void multipleSubscribeOnSimple() {
        Flux<Integer> flux = Flux.range(1, 4)
                .subscribeOn(Schedulers.single())
                .map(i -> {
                    log.info("Map 1 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                })
                .subscribeOn(Schedulers.boundedElastic())
                .map(i -> {
                    log.info("Map 2 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                });

        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext(1,2,3,4)
                .verifyComplete();
    }

    @Test
    public void multiplePublishOnSimple() {
        Flux<Integer> flux = Flux.range(1, 4)
                .publishOn(Schedulers.single())
                .map(i -> {
                    log.info("Map 1 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                }).publishOn(Schedulers.boundedElastic())
                .map(i -> {
                    log.info("Map 2 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                });
        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext(1,2,3,4)
                .verifyComplete();
    }

    @Test
    public void publishAndSubscribeOnSimple() {
        Flux<Integer> flux = Flux.range(1,4)
                .publishOn(Schedulers.single())
                .map(i -> {
                    log.info("Map 1 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                })
                .subscribeOn(Schedulers.boundedElastic())
                .map(i -> {
                    log.info("Map 2 - Number {} on Thread {}", i, Thread.currentThread().getName());
                    return i;
                });
        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext(1,2,3,4)
                .verifyComplete();
    }

    @Test
    public void subscribeOnIO() {
        Mono<List<String>> list = Mono.fromCallable(() -> Files.readAllLines(Path.of("text-file")))
                .log()
                .subscribeOn(Schedulers.boundedElastic());
        list.subscribe(s -> log.info("{}", s));

        StepVerifier.create(list)
                .expectSubscription()
                .thenConsumeWhile(l -> {
                    Assertions.assertFalse(l.isEmpty());
                    log.info("Size {}", l.size());
                    return true;
                }).verifyComplete();
    }

    @Test
    public void switchIfEmptyOperator() {
        Flux<Object> flux = emptyFlux()
                .switchIfEmpty(Flux.just("not empty anymore"))
                .log();

        StepVerifier.create(flux)
                .expectSubscription()
                .expectNext("not empty anymore")
                //.expectComplete()
                .verifyComplete();

    }
    private Flux<Object> emptyFlux() {
        return Flux.empty();
    }

    @Test
    public void deferOperator() {
        Mono<Long> just = Mono.just(System.currentTimeMillis());
        Mono<Long> defer = Mono.defer(() -> Mono.just(System.currentTimeMillis()));
        defer.subscribe(l -> log.info("time {}", l));
        defer.subscribe(l -> log.info("time {}", l));
        defer.subscribe(l -> log.info("time {}", l));
        defer.subscribe(l -> log.info("time {}", l));

        AtomicLong atomicLong = new AtomicLong();
        defer.subscribe(atomicLong::set);
        Assertions.assertTrue(atomicLong.get()>0);
    }

    @Test
    public void concatOperator() {
        Flux<String> flux1 = Flux.just("a", "b");
        Flux<String> flux2 = Flux.just("c", "d");

        Flux<String> concatFlux = Flux.concat(flux1, flux2).log();

        StepVerifier.create(concatFlux)
                .expectSubscription()
                .expectNext("a","b","c","d")
                .expectComplete()
                .verify();
    }

    @Test
    public void concatWithOperator() {
        Flux<String> flux1 = Flux.just("a", "b");
        Flux<String> flux2 = Flux.just("c", "d");

        Flux<String> concatWithFlux = flux1.concatWith(flux2).log();

        StepVerifier.create(concatWithFlux)
                .expectSubscription()
                .expectNext("a","b","c","d")
                .expectComplete()
                .verify();
    }

    @Test
    public void combineLastOperator() {
        Flux<String> flux1 = Flux.just("a", "b");
        Flux<String> flux2 = Flux.just("c", "d");

        Flux<String> combineLastFlux = Flux.combineLatest(flux1, flux2, (s1, s2) -> s1.toUpperCase() + " - " + s2.toUpperCase())
                .log();
        StepVerifier.create(combineLastFlux)
                .expectSubscription()
                .expectNext("B - C","B - D")
                .expectComplete()
                .verify();
    }

    @Test
    public void mergeOperator() {
        Flux<String> flux1 = Flux.just("a", "b").delayElements(Duration.ofMillis(200));
        Flux<String> flux2 = Flux.just("c", "d");
        Flux<String> mergeFlux = Flux.merge(flux1, flux2).log();
        mergeFlux.subscribe(log::info);

        StepVerifier.create(mergeFlux)
                .expectSubscription()
                .expectNext("c","d", "a","b")
                .expectComplete()
                .verify();
    }

    @Test
    public void mergeSequenceOperator() {
        Flux<String> flux1 = Flux.just("a", "b").delayElements(Duration.ofMillis(200));
        Flux<String> flux2 = Flux.just("c", "d");
        Flux<String> mergeFlux = Flux.mergeSequential(flux1, flux2, flux1).log();
        mergeFlux.subscribe(log::info);

        StepVerifier.create(mergeFlux)
                .expectSubscription()
                .expectNext("a","b","c","d","a","b")
                .expectComplete()
                .verify();
    }

    @Test
    public void flatMapOperator() {
        Flux<String> flux1 = Flux.just("a","b");
        Flux<String> mapFlux = flux1.map(String::toUpperCase)
                .flatMap(this::findByName)
                .log();
        mapFlux.subscribe(log::info);
        StepVerifier
                .create(mapFlux)
                .expectSubscription()
                .expectNext("nameA1","nameA2","nameB1","nameB2")
                .verifyComplete();
    }

    public Flux<String> findByName(String name) {
        return name.equals("A")? Flux.just("nameA1", "nameA2"): Flux.just("nameB1", "nameB2");
    }

    @Test
    public void zipOperator() {
        Flux<String> titleFlux = Flux.just("Grand Blue", "Baki");
        Flux<String> studioFlux = Flux.just("Zero-G", "TM Entertainment");
        Flux<Integer> episodesFlux = Flux.just(12,24);
        //Flux<Tuple3<String, String, Integer>> tuple3Flux = Flux.zip(titleFlux, studioFlux, episodesFlux);
        Flux<Anime> animeFlux = Flux.zip(titleFlux, studioFlux, episodesFlux)
                .flatMap(tuple -> Flux.just(new Anime(tuple.getT1(), tuple.getT2(), tuple.getT3())));
        animeFlux.subscribe(a -> log.info(a.toString()));

        StepVerifier.create(animeFlux)
                .expectSubscription()
                .expectNext(
                        new Anime("Grand Blue", "Zero-G", 12),
                        new Anime("Baki", "TM Entertainment", 24)
                ).verifyComplete();
    }

}
