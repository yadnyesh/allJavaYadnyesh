package io.yadnyesh.udemy.funcreactmodern.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Slf4j
public class SupplierPractive {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "new String by Supplier";
        Supplier<Double> randonNumber = Math::random;
        log.info(stringSupplier.get());
        log.info(randonNumber.get().toString());
    }
}
