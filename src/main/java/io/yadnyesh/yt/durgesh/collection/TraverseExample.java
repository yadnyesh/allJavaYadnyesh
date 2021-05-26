package io.yadnyesh.yt.durgesh.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;

@Slf4j
public class TraverseExample {
  public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();
      names.add("Yadnyesh");
      names.add("India");
      names.add("Oakistan");
      names.add("Bangla");
      log.info(names.toString());
      for(String str:names) {
          log.info(str + "\t" + str.length());
      }
      Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
        String next = iterator.next();
        log.info(next);
      }
  }
}
