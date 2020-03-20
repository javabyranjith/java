package jbr.java11.features;

import static java.util.function.Predicate.not;

import java.util.function.Predicate;

public class PredicateClassMethods {

  public static void main(String[] args) {
    String news = "Today is Monday\n and it is a hot day\n needs some drink";

    System.out.println(news.lines().filter(s -> !s.isBlank()).count());
    System.out.println(news.lines().filter(Predicate.not(String::isBlank)).count());
    System.out.println(news.lines().filter(not(String::isBlank)).count());
  }
}
