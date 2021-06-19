package io.yadnyesh.yt.mithu.rxjava;

import io.reactivex.rxjava3.core.Observable;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class SomeMoreObservables {
  public static void main(String[] args) {
      createColdObservable();
    //


  }

    private static void createColdObservable() {
        Observable observable = Observable.just(1,2,3,4,5);
        observable.subscribe(item -> log.info("Observer 1: " + item.toString()));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        observable.subscribe(item -> log.info("Observer 2: " + item.toString()));
    }
}
