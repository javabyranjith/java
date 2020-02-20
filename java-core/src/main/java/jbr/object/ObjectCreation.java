package jbr.object;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectCreation {
  public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException,
      InstantiationException, IllegalAccessException, IOException {

    // Way1 - Using new keyword
    ObjectCreation newOperator = new ObjectCreation();
    System.out.println("New Operator: " + newOperator.hashCode());

    // Way2 - Using Class.forName()
    Class classDotForName = Class.forName("jbr.javabasics.ObjectCreation");
    System.out.println("Class Dot For Name: " + classDotForName.hashCode());

    // Way3 - Using clone()
    ObjectCreation anotherObject = new ObjectCreation();
    System.out.println("anotherObject: " + anotherObject.hashCode());
    ObjectCreation clone = (ObjectCreation) anotherObject.clone();
    System.out.println("clone: " + clone.hashCode());

    // Way4 - Using object deserialization
    // replace null with any InputStream Object.
    ObjectInputStream inStream = new ObjectInputStream(null);
    ObjectCreation object = (ObjectCreation) inStream.readObject();

    newOperator.createMethod();
  }

  public void createMethod() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    // Way5 - using class loader
    ObjectCreation classLoader = (ObjectCreation) this.getClass().getClassLoader()
        .loadClass("jbr.javabasics.ObjectCreation").newInstance();
    System.out.println("classLoader: " + classLoader.hashCode());
  }
}
