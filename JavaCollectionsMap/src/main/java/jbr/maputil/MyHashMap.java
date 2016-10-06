package jbr.maputil;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
  public static Map<String, String> getMap1StringString() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("4", "Four");
    map.put("1", "One");
    map.put("5", "Five");
    map.put("3", "Three");
    map.put("2", "Two");

    return map;
  }

  public static Map<String, String> getMap2StringString() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("Four", "4");
    map.put("One", "1");
    map.put("Five", "5");
    map.put("Three", "3");
    map.put("Two", "2");

    return map;
  }

  public static Map<String, Integer> getMapStringInteger() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("One", 1);
    map.put("Four", 4);
    map.put("Two", 2);
    map.put("Five", 5);
    map.put("Three", 3);

    return map;
  }

  public static Map<Integer, String> getMapIntegerString() {
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(4, "Four");
    map.put(1, "One");
    map.put(5, "Five");
    map.put(3, "Three");
    map.put(2, "Two");

    return map;
  }

  public static Map<Float, String> getMap1FloatString() {
    Map<Float, String> map = new HashMap<Float, String>();
    map.put(4.0f, "four");
    map.put(0.0f, "zero");
    map.put(2.0f, "two");
    map.put(4.4f, "four.four");
    map.put(1.0f, "one");

    return map;
  }

  public static Map<String, String> getMap2FloatString() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("4.0f", "four");
    map.put("0.0f", "zero");
    map.put("2.0f", "two");
    map.put("4.4f", "four.four");
    map.put("1.0f", "one");

    return map;
  }
  
  // TODO: Double Map
}
