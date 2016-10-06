package jbr.treemap;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
  public static Map<String, String> getMap1StringString() {
    Map<String, String> map = new TreeMap<String, String>();
    map.put("4", "Four");
    map.put("1", "One");
    map.put("5", "Five");
    map.put("3", "Three");
    map.put("2", "Two");

    return map;
  }

  public static Map<String, String> getMap2StringString() {
    Map<String, String> map = new TreeMap<String, String>();
    map.put("Four", "4");
    map.put("One", "1");
    map.put("Five", "5");
    map.put("Three", "3");
    map.put("Two", "2");

    return map;
  }

  public static Map<String, Integer> getMapStringInteger() {
    Map<String, Integer> map = new TreeMap<String, Integer>();
    map.put("One", 1);
    map.put("Four", 4);
    map.put("Two", 2);
    map.put("Five", 5);
    map.put("Three", 3);

    return map;
  }

  public static Map<Integer, String> getMapIntegerString() {
    Map<Integer, String> map = new TreeMap<Integer, String>();
    map.put(4, "Four");
    map.put(1, "One");
    map.put(5, "Five");
    map.put(3, "Three");
    map.put(2, "Two");

    return map;
  }

  public static Map<Float, String> getMapFloat1String() {
    Map<Float, String> map = new TreeMap<Float, String>();
    map.put(4.0f, "four");
    map.put(0.0f, "zero");
    map.put(2.0f, "two");
    map.put(4.4f, "four.four");
    map.put(1.0f, "one");

    return map;
  }

  public static Map<String, String> getMapFloat2String() {
    Map<String, String> map = new TreeMap<String, String>();
    map.put("4.0f", "four");
    map.put("0.0f", "zero");
    map.put("2.0f", "two");
    map.put("4.4f", "four.four");
    map.put("1.0f", "one");

    return map;
  }
}
