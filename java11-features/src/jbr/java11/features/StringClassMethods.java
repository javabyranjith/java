package jbr.java11.features;

import java.util.stream.Stream;

public class StringClassMethods {

  public static void main(String[] args) {

    String name = "Ranjith";
    String address = "\t ";

    System.out.println("name isBlank: " + name.isBlank());
    System.out.println("name isEmpty: " + name.isEmpty());

    // true when 1)no characters or even space, 2) escape characters found
    System.out.println("address isBlank: " + address.isBlank());
    // true only if nothing found
    System.out.println("address isEmpty: " + address.isEmpty());

    String news = "Today is Monday\n and it is a hot day\n needs some drink";
    Stream<String> lines = news.lines();
    System.out.println("First line: " + lines.findFirst().get());
    lines = news.lines();
    System.out.println("lines count: " + lines.count());

    String country = "india";
    System.out.println(country.repeat(3));

    String animals = " Tiger Lion Elephant  \t        ";
    System.out.println("after strip length\t\t: " + animals.strip().length());
    System.out.println("after trim\t\t\t: " + animals.trim().length());
    System.out.println("after stripLeading length\t: " + animals.stripLeading().length());
    System.out.println("after stripTrailing length\t: " + animals.stripTrailing().length());

  }
}
