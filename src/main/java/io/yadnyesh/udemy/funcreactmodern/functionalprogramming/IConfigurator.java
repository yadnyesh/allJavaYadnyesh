package io.yadnyesh.udemy.funcreactmodern.functionalprogramming;

public interface IConfigurator<T, R> {
    R configure(T t);
}
