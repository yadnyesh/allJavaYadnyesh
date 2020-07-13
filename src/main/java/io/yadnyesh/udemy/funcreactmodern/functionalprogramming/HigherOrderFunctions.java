package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HigherOrderFunctions {
    public static void main(String[] args) {

        IFactory<Integer> createFactory = createFactory(() -> Math.random()*100, r -> r.intValue());
        Integer product = createFactory.create();
        log.info(product.toString());


    }
    public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {
        return () -> {
            T product  = producer.produce();
            return configurator.configure(product);
        };
    }
}
