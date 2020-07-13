package io.yadnyesh.udemy.funcreactmodern.lambda;

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
        Optional<String> stringOptional = Optional.of("Value");
        optional.ifPresent(val -> log.info("String of optional IfPresent -> " + val));
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(log::info, () -> log.info("Value is absent"));
        optional.stream().forEach(log::info);
        emptyOptional.or(() -> Optional.of("Empty when using .or()")).ifPresent(log::info);
        System.out.println(optional.equals(Optional.of("Value")));
        System.out.println(optional.hashCode());
        System.out.println(Optional.of("Value").hashCode());
    }
}
