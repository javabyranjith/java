package jbr.java;

import org.junit.Before;
import org.junit.Test;

import jbr.java.prog2impl.FlatFileDataReader;

public class ProgToImplTest {

  private FlatFileDataReader _flatFileDataReader;

  @Before
  public void init() throws Exception {
    _flatFileDataReader = new FlatFileDataReader("testdata/prog2impl-data.txt");
  }

  @Test
  public void testFlatFileDataReader() throws Exception {
    System.out.println("\n===testFlatFileDataReader");
    System.out.println(_flatFileDataReader.read());
  }

}
