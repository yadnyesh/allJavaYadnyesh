package io.yadnyesh.yt.mithu.rxjava;

import io.reactivex.rxjava3.core.Observable;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Main {
  public static void main(String[] args) {
       createObservableWithJust();
       createObservableWithIterable();
       createObservableUsingCreate();
  }

    private static void createObservableUsingCreate() {
      Observable<Integer> integerObservable = Observable.just(1,2,3,4,5);
      integerObservable
              .subscribe(item -> log.info(item.toString()));
    }

    private static void createObservableWithIterable() {
      List<Integer> integerList = Arrays.asList(6,7,8,9,null,10,11);
      Observable<Integer> integerObservableFromList = Observable.fromIterable(integerList);
      integerObservableFromList
              .subscribe(item -> log.info(item.toString()),
                         error -> log.error("Error..." + error.toString()),
                         () -> log.info("Completed"));

    }

    private static void createObservableWithJust() {
      Observable<Integer> observable = Observable.create(emitter -> {
        emitter.onNext(111);
        emitter.onNext(112);
        emitter.onComplete();
      });
      observable.subscribe(item -> log.info(item.toString()));
    }

}
