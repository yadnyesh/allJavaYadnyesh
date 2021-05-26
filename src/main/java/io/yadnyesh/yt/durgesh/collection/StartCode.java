package io.yadnyesh.yt.durgesh.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

@Slf4j
public class StartCode {
  public static void main(String[] args) {
    log.info("Coding with Java Collection API");

      HashSet<Double> nms = new HashSet<>();
      nms.add(14.14);
      nms.add(34.123);
      nms.add(99.8);
      nms.add(1.4334);
      log.info(nms.toString());


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

      Vector<String> vector = new Vector<>();
      vector.addAll(names);
      log.info(names.toString());

  }
}
