package jbr.java.prog2impl;

import java.io.FileNotFoundException;

/**
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 * @since Jul 30, 2015
 **/
public class DataReaderMain {

  private FlatFileDataReader flatFileReader;
  private String fileName = "data.txt";

  DataReaderMain() throws FileNotFoundException {
    flatFileReader = new FlatFileDataReader(fileName);
  }

  private String getData() throws FileNotFoundException {
    return flatFileReader.read();
  }

  public static void main(String[] args) throws FileNotFoundException {
    DataReaderMain client = new DataReaderMain();
    System.out.println(client.getData());
  }

}
