package io.yadnyesh.yt.threaddump;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ThreadDumpApp {
    public static void main(String[] args) {
      log.info("Application Started.....");
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            userList.add(new User(i, "Test: " + 1));
        }
      log.info("Application Ended");
    }
}
