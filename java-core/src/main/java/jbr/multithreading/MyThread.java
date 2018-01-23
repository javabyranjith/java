package jbr.multithreading;

public class MyThread implements Runnable {

  public String threadName;

  MyThread(String name) {
    this.threadName = name;
    System.out.println(threadName + " thread created...");
  }

  @Override
  public void run() {
    System.out.println(threadName + " thread running...");
    for (int i = 0; i <= 4; i++) {
      System.out.println(threadName + " thread at " + i);
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        System.out.println(threadName + " thread interrupted.");
      }
    }
    System.out.println(threadName + " thread existing...");
  }

}
