package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.reactive;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallBackDemo {
  public static void main(String[] args) throws InterruptedException {
    log.info("Main Thread is running.");
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            new CallBackDemo().runningAsync(new CallBack() {
                @Override
                public void call() {
                    log.info("Callback called!");
                }
            });
        }
    };

    Thread thread = new Thread(runnable);
    thread.start();
    Thread.sleep(2000);
    log.info("Main thread completed");
  }

  public void runningAsync(CallBack callBack) {
      log.info("Running on a separate thread");
      sleep(1000);
      callBack.call();
  }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
