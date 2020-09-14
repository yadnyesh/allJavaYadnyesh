package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
      contacts.forEach((k,v) -> log.info(k + "  " + v));

      contacts.entrySet().stream()
              .sorted(Map.Entry.comparingByValue())
              .collect(Collectors.toMap(c -> c.getKey(), c -> c.getValue(),(v1, v2) -> v1 ,LinkedHashMap::new))
              .forEach((k,v) -> log.info(k + " -- " + v));

      Map<String, Double> marks = new HashMap<>();
      marks.put("Science", 96.00);
      marks.put("Maths", 70.00);
      marks.put("English", 90.00);
      marks.put("History", 85.00);

      OptionalDouble optionalDouble = marks.values().stream()
              .mapToDouble(m -> m)
              .average();
      log.info(("--------------------------------------------"));
      log.info("Average Marks are: " + optionalDouble);
  }
}
