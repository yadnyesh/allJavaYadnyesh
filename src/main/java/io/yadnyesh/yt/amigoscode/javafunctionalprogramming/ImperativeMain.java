package io.yadnyesh.yt.amigoscode.javafunctionalprogramming;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class ImperativeMain {
  public static void main(String[] args) {
    //
      List<Person> people = List.of(
              new Person("John", Gender.MALE),
              new Person("Alice", Gender.FEMALE),
              new Person("Varada", Gender.FEMALE),
              new Person("Yadnyesh", Gender.MALE),
              new Person("Alisha", Gender.FEMALE)

      );

      List<Person> females = new ArrayList<>();
      for(Person person : people){
          if(person.gender.equals(Gender.FEMALE)) {
              females.add(person);
          }
      }
      log.info("Imperative approach: " + females.size());

      log.info("Declarative approach below -- ");
      Predicate<Person> femalePredicate = person -> Gender.FEMALE.equals(person.gender);
      people.stream()
              .filter(femalePredicate)
              .forEach(e -> log.info(e.toString()));

  }

    private static class Person {
      private final String name;
      private final Gender gender;

        private Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
      MALE, FEMALE
    }
}
