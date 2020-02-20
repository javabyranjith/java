package jbr.object.cloing;

public class Education implements Cloneable {

  private String _courseName;
  private int _percentage;
  private int _yearOfPassing;

  Education(String course, int percent, int passout) {
    this._courseName = course;
    this._percentage = percent;
    this._yearOfPassing = passout;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public String getCourseName() {
    return _courseName;
  }

  public void setCourseName(String courseName) {
    this._courseName = courseName;
  }

  public int getPercentage() {
    return _percentage;
  }

  public void setPercentage(int percentage) {
    this._percentage = percentage;
  }

  public int getYearOfPassing() {
    return _yearOfPassing;
  }

  public void setYearOfPassing(int yearOfPassing) {
    this._yearOfPassing = yearOfPassing;
  }

}
