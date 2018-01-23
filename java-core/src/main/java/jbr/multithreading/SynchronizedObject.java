package jbr.multithreading;

public class SynchronizedObject {
  public static int val = 10;

  public void update() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Value " + i);
      }
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
  }
}
