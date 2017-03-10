package jbr.composition;

public class Bike implements Vehicle {

  Engine engine = new Engine();

  public void move() {
    engine.start();
  }

  public void stop() {
    engine.stop();
  }

}
