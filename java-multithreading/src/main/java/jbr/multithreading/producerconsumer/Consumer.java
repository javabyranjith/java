package jbr.multithreading.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {
  public List<Integer> pool;

  public Consumer(List<Integer> pool) {
    this.pool = pool;
  }

  @Override
  public void run() {
    while (true) {
      try {
        consume();
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void consume() throws InterruptedException {
    synchronized (pool) {
      while (pool.size() == 0) {
        System.out
            .println("Pool is empty, consumerThread is waiting for " + "producerThread to produce, pool's size= 0");
        pool.wait();
      }
    }

    synchronized (pool) {
      Thread.sleep((long) (Math.random() * 2000));
      System.out.println("Consumed : " + pool.remove(0));
      pool.notify();
    }
  }
}
