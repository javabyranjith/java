package jbr.javabasics.cloning;

public class Person implements Cloneable {

  private String _firstname;
  private String _lastname;
  private Address _address;

  Person(String firstname, String lastname, Address address) {
    this._firstname = firstname;
    this._lastname = lastname;
    this._address = address;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public String getFirstname() {
    return _firstname;
  }

  public void setFirstname(String firstname) {
    this._firstname = firstname;
  }

  public String getLastname() {
    return _lastname;
  }

  public void setLastname(String lastname) {
    this._lastname = lastname;
  }

  public Address getAddress() {
    return _address;
  }

  public void setAddress(Address address) {
    this._address = address;
  }

}
