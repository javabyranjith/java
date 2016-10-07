package jbr.multithreading;

public class SynchronizedObjectRun {

  public static void main(String[] args) {

    Thread t1 = new Thread(new SynchronizedObjectThread("test1", new SynchronizedObject()));
    Thread t2 = new Thread(new SynchronizedObjectThread("test2", new SynchronizedObject()));

    t1.start();
    t2.start();

  }
}
