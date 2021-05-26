package io.yadnyesh.yt.durgesh.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class MapExample {
  public static void main(String[] args) {
      HashMap<String, Integer> courses = new HashMap<>();
      courses.put("Core Java", 4000);
      courses.put("Basic Python", 3500);
      courses.put("Spring", 5000);
      courses.put("Android", 1000);
      courses.forEach((e1, e2) -> log.info(e1 + " => " + e2));
  }
}
