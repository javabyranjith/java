package jbr.ioexamples.fileoperations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReadBz2FileTest {

  private ReadBz2File _readBz2File;

  @Before
  public void setUp() throws Exception {
    _readBz2File = new ReadBz2File();
  }

  @Test
  public void test() {
    String result = _readBz2File.getBz2FileContent("testdata/fileoperations/myfile.bz2");
    System.out.println(result);

    Assert.assertNotNull(result);
  }

}
