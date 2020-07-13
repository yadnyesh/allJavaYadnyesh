package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T r);

    default <V> Function<V,R> compose(Function<V, T> before) {
        return (V v) -> apply(before.apply(v));
    }
}
