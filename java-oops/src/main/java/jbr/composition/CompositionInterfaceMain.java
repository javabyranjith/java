package jbr.composition;

public class CompositionInterfaceMain {

  public static void main(String[] args) {
    Vehicle car = new Car();
    car.move();
    car.stop();
  }
}
