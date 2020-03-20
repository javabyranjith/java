package jbr.java11.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TypeInference {

  public static void main(String[] args) {

    var languages = List.of("Java", "C", "C++");
    System.out.println(languages.size());
    System.out.println(languages.get(0));

    var var = new ArrayList<>();
    System.out.println(var.size());
    
    List<String> birds = List.of("Dove", "Peacock", "Crow", "", "Parrot");

    birds.stream().map(b -> b.toUpperCase()).collect(Collectors.toList());

    // birds.stream().map((@NotNull var b) ->
    // b.toUpperCase()).collect(Collectors.toList());

  }
}
