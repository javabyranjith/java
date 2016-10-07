package jbr.multithreading;

public class SynchronizedObjectThread implements Runnable {

  public String threadName;
  SynchronizedObject update;

  SynchronizedObjectThread(String name, SynchronizedObject update) {
    this.threadName = name;
    this.update = update;
    System.out.println(threadName + " thread created...");
  }

  @Override
  public void run() {
    System.out.println(threadName + " thread started...");
    synchronized (update) {
      update.update();
    }
    System.out.println(threadName + " thread ended...");
  }

}
