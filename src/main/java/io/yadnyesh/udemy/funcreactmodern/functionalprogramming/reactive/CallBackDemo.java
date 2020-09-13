package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.reactive;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallBackDemo {
  public static void main(String[] args) throws InterruptedException {
    log.info("Main Thread is running.");
    Runnable runnable =
        new Runnable() {
          @Override
          public void run() {
            new CallBackDemo()
                .runningAsync(
                    new CallBack() {
                      @Override
                      public void call() {
                        log.info("Callback called!");
                      }

                      @Override
                      public void pushComplete() {
                        log.info("Callback done!");
                      }

                      @Override
                      public void pushData(String data) {
                        log.info("Callback data: " + data);
                      }

                      @Override
                      public void pushError(Exception exs) {
                        log.info("Some error occurred: " + exs.toString());
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
      log.info("Running on a separate thread -> " + Thread.currentThread().getName());
      sleep(1000);
      callBack.pushData("data1");
      callBack.pushData("data2");
      callBack.pushData("data3");
      callBack.pushData("data4");
      callBack.pushError(new RuntimeException("Error occurred in call back"));
      callBack.pushData("data5");
      callBack.pushData("data6");
      callBack.pushError(new RuntimeException("Error occurred again in call back"));
      callBack.pushComplete();
  }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
