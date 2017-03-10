package jbr.hashtable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class IterateHashtable {

  public static void main(String[] args) {

    Hashtable<String, String> hashtable = new Hashtable<String, String>();
    hashtable.put("Name", "Ranjith");
    hashtable.put("Age", "33");
    hashtable.put("Address", "Chennai");

    System.out.println("get keys using Enumeration....");
    Enumeration<String> keys = hashtable.keys();
    while (keys.hasMoreElements()) {
      System.out.println(keys.nextElement());
    }

    System.out.println("\nget values using Enumeration....");
    Enumeration<String> values = hashtable.elements();
    while (values.hasMoreElements()) {
      System.out.println(values.nextElement());
    }

    System.out.println("\nget values using Collection....");
    Collection<String> values1 = hashtable.values();
    Iterator<String> itr = values1.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("\nget keys & values using entryset....");
  }
}
