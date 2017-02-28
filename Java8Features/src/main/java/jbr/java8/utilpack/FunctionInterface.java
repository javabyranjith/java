package jbr.java8.utilpack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import jbr.java8.model.Gender;
import jbr.java8.model.Person;

/**
 * Examples of Function Interface
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class FunctionInterface {

  public static void main(String[] args) {

    List<Person> persons = Arrays
        .asList(new Person[] { new Person("Sekar", "Chinnappan", Gender.MALE, "Hydrabad", 55, 88000),
            new Person("Ranjith", "Sekar", Gender.MALE, "Chennai", 23, 96000),
            new Person("Kabilan", "Ranjith", Gender.MALE, "Bangalore", 3, 86000),
            new Person("Nivedha", "Ranjith", Gender.FEMALE, "Delhi", 1, 97000) });

    // OLD WAY
    for (Person p : persons)
      p.firstNameFirst();

    System.out.println("\n");
    for (Person p : persons)
      p.lastNameFirst();

    // NEW WAY
    Function<Person, String> firstNameFirst = p -> "Name: " + p.getFirstname() + "," + p.getLastname() + "\nAddress: "
        + p.getAddress() + "\nPhone: " + p.getPhone();
    for (Person person : persons)
      System.out.println(person.printMe(firstNameFirst));

    // persons.forEach(Person::printMe(firstNameFirst));

    System.out.println("\n");
    Function<Person, String> lastNameFirst = p -> "Name: " + p.getLastname() + "," + p.getFirstname() + "\nAddress: "
        + p.getAddress() + "\nPhone: " + p.getPhone();
    for (Person person : persons)
      System.out.println(person.printMe(lastNameFirst));
  }

}
