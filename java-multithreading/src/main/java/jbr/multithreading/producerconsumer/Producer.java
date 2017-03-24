package jbr.multithreading.producerconsumer;

import java.util.List;

public class Producer implements Runnable {

  public List<Integer> pool;
  public int poolSize = 10;

  public Producer(List<Integer> pool) {
    this.pool = pool;
  }

  public void run() {
    for (int i = 1; i <= 100; i++) {
      try {
        produce(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void produce(int i) throws InterruptedException {
    synchronized (pool) {
      while (pool.size() == poolSize) {
        System.out.println("Pool is full, producerThread is waiting for "
            + "consumerThread to consume, sharedPool's size= " + poolSize);
        pool.wait();
      }
    }

    synchronized (pool) {
      System.out.println("Produced : " + i);
      pool.add(i);
      Thread.sleep((long) (Math.random() * 1000));
      pool.notify();
    }
  }

}
