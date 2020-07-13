package io.yadnyesh.udemy.funcreactmodern;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class Unwrap {

    public static void main(String[] args) {
        Integer a = 10;
        Optional<Integer> optionalInteger = Optional.of(a);
        Optional<Integer> emptyOptional = Optional.empty();
        Integer existingVal = optionalInteger.orElse(1000);
        log.info("Exisiting Value: " + existingVal);
        Integer val = emptyOptional.orElse(200);
        log.info(" val is : " + val);

    }

}
