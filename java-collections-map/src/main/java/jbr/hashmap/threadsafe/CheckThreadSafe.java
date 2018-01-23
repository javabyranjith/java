package jbr.hashmap.threadsafe;

import java.util.Map;

public class CheckThreadSafe implements Runnable {

  private String threadName;
  MyMap myMap;

  public CheckThreadSafe(String threadName, MyMap map) {
    this.threadName = threadName;
    this.myMap = map;
    System.out.println(threadName + " thread created!");
  }

  public void run() {
    System.out.println(threadName + " thread running!!");
    synchronized (myMap) {
      myMap.updateHashMap();
    }
    for (Map.Entry<String, String> map : myMap.map.entrySet()) {
      System.out.println("Key: " + map.getKey() + " >> Value: " + map.getValue());
    }
    System.out.println(threadName + " thread exiting!!");
  }

}
