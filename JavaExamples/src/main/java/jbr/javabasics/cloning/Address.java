package jbr.javabasics.cloning;

public class Address {

  private int _doorNo;
  private String _streetName;
  private String _city;
  private int _pincode;

  Address(int doorNo, String streetName, String city, int pincode) {
    this._doorNo = doorNo;
    this._streetName = streetName;
    this._city = city;
    this._pincode = pincode;
  }

  public int getDoorNo() {
    return _doorNo;
  }

  public void setDoorNo(int doorNo) {
    this._doorNo = doorNo;
  }

  public String getStreetName() {
    return _streetName;
  }

  public void setStreetName(String streetName) {
    this._streetName = streetName;
  }

  public String getCity() {
    return _city;
  }

  public void setCity(String city) {
    this._city = city;
  }

  public int getPincode() {
    return _pincode;
  }

  public void setPincode(int pincode) {
    this._pincode = pincode;
  }

}
