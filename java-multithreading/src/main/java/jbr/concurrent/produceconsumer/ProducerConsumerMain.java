package jbr.concurrent.produceconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerMain {

  public static void main(String[] args) {
    BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();

    Producer producer = new Producer(sharedQueue);
    Consumer consumer = new Consumer(sharedQueue);

    Thread producerThread = new Thread(producer, "ProducerThread");
    Thread consumerThread = new Thread(consumer, "ConsumerThread");
    producerThread.start();
    consumerThread.start();

  }
}
