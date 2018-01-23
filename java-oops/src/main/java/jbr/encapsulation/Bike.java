package jbr.encapsulation;

public class Bike {
  private String _name = "splendor";
  private String _manufacturer = "hero";
  private String _model = "2014";
  private int _price;

  public int getPrice() {
    if (_name.equalsIgnoreCase("splendor")) {
      _price = 40000;
    }
    return _price;
  }

  public void setPrice(int price) {
    this._price = price;
  }

  Bike(String name, String manufacturer, String model) {
    this._name = name;
    this._manufacturer = manufacturer;
    this._model = model;
  }

  public String getName() {
    return _name;
  }

  public void setName(String name) {
    this._name = name;
  }

  public String getManufacturer() {
    return _manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this._manufacturer = manufacturer;
  }

  public String getModel() {
    return _model;
  }

  public void setModel(String model) {
    this._model = model;
  }

}
