package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class Operations {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");
        log.info("Optional before map: " + optional.orElse("Yadnyesh"));
        Optional<String> map = optional.map(val -> "Replaced");
        log.info("After applying map: " + map.orElse("Yadnyesh"));
        Optional<String> filter = optional.filter(val -> val.contains("Valu"));
        log.info(filter.orElse("Not Found"));
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced FlatMap"));
        log.info(flatMap.orElse("yad not found"));
    }
}
