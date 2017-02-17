package jbr.java8.lamdas;

public class LamdaBasics {

  public static void main(String[] args) {
    MyLamda test = () -> System.out.println("Hello Lamda!!");
    test.foo();

    MyLamda myLamdaImpl = new MyLamdaImpl();
    myLamdaImpl.foo();

    // Add add = (int a, int b) -> a + b;
    Math add = (a, b) -> a + b;
    System.out.println("Sum is: " + add.calc(8, 4));

    Math sub = (a, b) -> a - b;
    System.out.println("Subtraction is: " + sub.calc(8, 4));

    Math mul = (a, b) -> a * b;
    System.out.println("Multiplication is: " + mul.calc(8, 4));

    Math div = (a, b) -> {
      if (b == 0) return 0;
      return a / b;
    };
    System.out.println("Division is: " + div.calc(8, 4));

  }
}

interface MyLamda {
  void foo();
}

interface Math {
  int calc(int a, int b);
}

class MyLamdaImpl implements MyLamda {
  @Override
  public void foo() {
    System.out.println("My Lamda Impl!!!");
  }
}
