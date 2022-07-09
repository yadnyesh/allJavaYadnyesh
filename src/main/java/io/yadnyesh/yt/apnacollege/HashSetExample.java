package io.yadnyesh.yt.apnacollege;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Iterator;

@Slf4j
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println(hashSet.contains(1) ? "yes": "no");
        log.info("Size of the hashset is: " + hashSet.size());
        System.out.println(hashSet.toString());

        Iterator setIterator = hashSet.iterator();
        while (setIterator.hasNext())
            log.info(setIterator.next().toString());

    }
}
