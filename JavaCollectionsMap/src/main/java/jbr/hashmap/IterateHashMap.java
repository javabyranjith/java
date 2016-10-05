package jbr.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<String, String>();
    map.put("firstname", "Ranjith");
    map.put("lastname", "Sekar");
    map.put("dob", "15-May-1990");
    map.put("address", "Chennai");
    map.put("phone", "9600096000");
    
    entrySet(map);
  }
  
  

  public static void entrySet(Map<String, String> map) {
    for (Map.Entry<String, String> m : map.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }
  }

}
