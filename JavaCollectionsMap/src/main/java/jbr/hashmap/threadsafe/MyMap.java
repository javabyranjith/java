package jbr.hashmap.threadsafe;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

  Map<String, String> map;

  public void updateHashMap() {
    map = new HashMap<String, String>();
    map.put("4", "Four");
    map.put("1", "One");
    map.put("5", "Five");
    map.put("3", "Three");
    map.put("2", "Two");

    String val = map.get("2");
    map.put("2", val + "Two");
  }

}
