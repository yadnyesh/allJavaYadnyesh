package io.yadnyesh.yt.mithu.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
  public static void main(String[] args) {
        Thread myThread = new Thread(Main::runIT);
  }

  public static void runIT() {
      log.info("Run...");
  }
}
