package jbr.javabasics.prog2interface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlatFileDataReader implements DataReader {

  private StringBuilder _stringBuilderbuilder;
  private Scanner _scanner;

  public FlatFileDataReader(String fileName) throws FileNotFoundException {
    _scanner = new Scanner(new File(fileName));
    _stringBuilderbuilder = new StringBuilder();
  }

  public String readData() {
    while (_scanner.hasNext()) {
      _stringBuilderbuilder.append(_scanner.next());
    }

    return _stringBuilderbuilder.toString();
  }
}
