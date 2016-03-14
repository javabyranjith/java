package jbr.javabasics.cloning;

public class Employee implements Cloneable {

  private int _id;
  private String _name;
  private String _designation;
  private Education _education;

  Employee(int empid, String empname, String desig, Education edu) {
    this._id = empid;
    this._name = empname;
    this._designation = desig;
    this._education = edu;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Employee emp = (Employee) super.clone();
    emp.setEducation((Education) _education.clone());

    return emp;
  }

  public int getId() {
    return _id;
  }

  public void setId(int id) {
    this._id = id;
  }

  public String getName() {
    return _name;
  }

  public void setName(String name) {
    this._name = name;
  }

  public String getDesignation() {
    return _designation;
  }

  public void setDesignation(String designation) {
    this._designation = designation;
  }

  public Education getEducation() {
    return _education;
  }

  public void setEducation(Education education) {
    this._education = education;
  }

}
