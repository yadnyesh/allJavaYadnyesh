package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MapFunctionalOperations {
  public static void main(String[] args) {
      Map<String, String> contacts = new HashMap<>();
      contacts.put("111111111", "John");
      contacts.put("222222222", "Tom");
      contacts.put("333333333", "Cat");
      contacts.put("444444444", "Rat");
      contacts.put("555555555", "Mat");
      for(Map.Entry<String, String> entry: contacts.entrySet()) {
        log.info(entry.getKey() + " --- " + entry.getValue());
      }
      contacts.forEach((k,v) -> log.info(k + " **** " + v));
      contacts.entrySet().stream()
              .filter(contact -> contact.getValue().equalsIgnoreCase("John"))
              .forEach(c -> log.info(c.toString()));

  }
}
