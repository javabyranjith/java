package jbr.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerMain {
  public static void main(String args[]) {
    List<Integer> pool = new LinkedList<Integer>();

    Producer producer = new Producer(pool);
    Consumer consumer = new Consumer(pool);

    Thread producerThread = new Thread(producer, "ProducerThread");
    Thread consumerThread = new Thread(consumer, "ConsumerThread");

    producerThread.start();
    consumerThread.start();
  }
}
