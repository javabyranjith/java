package jbr.hashmap.threadsafe;

public class CheckThreadSafeRun {

  public static void main(String[] args) {
    Thread t1 = new Thread(new CheckThreadSafe("test1", new MyMap()));
    t1.start();
    Thread t2 = new Thread(new CheckThreadSafe("test2", new MyMap()));
    t2.start();
  }
}
