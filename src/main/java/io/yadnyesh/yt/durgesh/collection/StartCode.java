package io.yadnyesh.yt.durgesh.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;

@Slf4j
public class StartCode {
  public static void main(String[] args) {
    log.info("Coding with Java Collection API");

      ArrayList<String> names = new ArrayList<>();
      names.add("Yadnyesh");
      names.add("India");
      names.add("Oakistan");
      names.add("Bangla");
      log.info(names.toString());

      var linkedList = new LinkedList();
      linkedList.add("Sachin");
      linkedList.add(100);
      linkedList.add(2);
      log.info(linkedList.toString());
  }
}
