package io.yadnyesh.udemy.funcreactmodern;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {
    R execute(T t);
}
