package jbr.javabasics.prog2interface;

public class DatabaseDataReader implements DataReader {

  private StringBuilder _stringBuilder;

  public DatabaseDataReader() throws Exception {
    _stringBuilder = new StringBuilder();
  }

  public String readData() {
    // Code to read database data
    return null;
  }
}
