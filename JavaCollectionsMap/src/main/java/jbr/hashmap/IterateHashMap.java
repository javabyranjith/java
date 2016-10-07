package jbr.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMap {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<String, String>();
    map.put("firstname", "Ranjith");
    map.put("lastname", "Sekar");
    map.put("dob", "15-May-1990");
    map.put("address", "Chennai");
    map.put("phone", "9600096000");

    entrySet(map);
    useIterator(map);

    // Update a map value
    String addr = map.get("address");
    map.put("address", addr + ", India");
    entrySet(map);

  }

  public static void entrySet(Map<String, String> map) {
    System.out.println("\nIterate using EntrySet");
    System.out.println("----------------------");
    for (Map.Entry<String, String> m : map.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }
  }

  public static void useIterator(Map<String, String> inputMap) {
    System.out.println("\nIterate using Iterator");
    System.out.println("----------------------");
    Set<Entry<String, String>> entrySet = inputMap.entrySet();
    Iterator<Entry<String, String>> itr = entrySet.iterator();

    while (itr.hasNext()) {
      Map.Entry<String, String> map = (Map.Entry<String, String>) itr.next();
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }

  }

}
