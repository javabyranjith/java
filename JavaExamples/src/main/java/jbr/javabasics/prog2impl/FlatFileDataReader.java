package jbr.javabasics.prog2impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlatFileDataReader {

  private StringBuilder _stringBuilder;
  private Scanner _scanner;

  public FlatFileDataReader(String fileName) throws FileNotFoundException {
    _scanner = new Scanner(new File(fileName));
    _stringBuilder = new StringBuilder();
  }

  public String read() {
    while (_scanner.hasNext()) {
      _stringBuilder.append(_scanner.next());
    }
    return _stringBuilder.toString();
  }
}
