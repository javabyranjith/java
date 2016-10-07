package jbr.multithreading;

public class MyThreadRun {

  public static void main(String[] args) {
    for (int i = 0; i <= 2; i++) {
      Thread t = new Thread(new MyThread("test" + i));
      t.start();
    }
  }
}
