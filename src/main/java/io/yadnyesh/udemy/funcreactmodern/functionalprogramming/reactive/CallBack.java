package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.reactive;

public interface CallBack {
    void call();

    void pushComplete();
    void pushData(String data);
    void pushError(Exception exception);
}
