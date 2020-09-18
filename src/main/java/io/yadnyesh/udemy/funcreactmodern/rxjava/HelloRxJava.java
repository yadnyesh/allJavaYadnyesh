package io.yadnyesh.udemy.funcreactmodern.rxjava;

import io.reactivex.rxjava3.core.Observable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloRxJava {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(
                e -> {
                    e.onNext("Hello");
                    e.onNext("from RxJava");
                }
        );

        source.subscribe(e -> log.info(e));
        source.subscribe(e -> log.info("Observer 2 :" + e));
    }
}
