package io.yadnyesh.yt.devdojo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
public class MonoTest {
    @Test
    public void test(){
        String name = "Yadnyesh";
        //List<String> stringList = List.of("Yadnyesh", "Bharat", "Juvekar");
        Mono<String> mono = Mono.just(name).log();
        mono.subscribe();
        log.info("Mono {}", mono);
        log.info("Project Setup Complete for Devdojo - Project Reactor");
    }
}
