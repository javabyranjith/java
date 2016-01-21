package jbr.javabasics;

import jbr.javabasics.prog2interface.DataReader;
import jbr.javabasics.prog2interface.DatabaseDataReader;
import jbr.javabasics.prog2interface.FlatFileDataReader;

import org.junit.Before;
import org.junit.Test;

public class ProgToInterfaceTest {

  private DataReader _flatFileReader;
  private DataReader _databaseReader;

  @Before
  public void init() throws Exception {
    _flatFileReader = new FlatFileDataReader("testdata/prog2interface-data.txt");
    _databaseReader = new DatabaseDataReader();
  }

  @Test
  public void testFlatFileDataReader() throws Exception {
    System.out.println("\n===testFlatFileDataReader");
    System.out.println(_flatFileReader.readData());
  }

  @Test
  public void testDatabaseDataReader() throws Exception {
    System.out.println("\n===testDatabaseDataReader");
    System.out.println(_databaseReader.readData());
  }

}
