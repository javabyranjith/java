package jbr.polymorphism.overloading;

/**
 * @author Ranjith Sekar(java2ranjith@gmail.com)
 * @since Jul 14, 2014
 */
public class MethodOverloading {

  public void method1() throws NullPointerException {
  }

  public void method1(int a, int b) throws NullPointerException {
  } // Valid - adding extra parameters

  public void method2(int a, char b) throws NullPointerException {
  } // valid

  public void method2(char a, int b) throws NullPointerException {
  } // valid - interchange the parameters.

  // public int method1(){} // Invalid - changing return type.

  // private void method1(){} //Invalid - changing access specifier

  // public void method1() throws Exception{ } //Invalid-changing Exception
  // class

  public void method1(float b) throws NullPointerException {
  } // Valid - changing parameter type

  public void method1(int b, int a, int c) throws NullPointerException {
  } // Valid - adding extra parameters

  int mymethod(int a, int b, float c) {
    return 5;
  }

  // invalid - change the param name
  /*
   * int mymethod(int var1, int var2, float var3) { return 34; }
   */
}
