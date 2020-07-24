package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

@Slf4j
public class SpliteratorChar {
  public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(4);
      arrayList.add(8);
      arrayList.add(10);
      arrayList.add(13);
      arrayList.add(17);

      Stream<Integer> integerStream = arrayList.stream();
      Spliterator<Integer> spliterator = integerStream.spliterator();
      int bits = spliterator.characteristics();
      log.info(String.valueOf(bits));

  }
}
