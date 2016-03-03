package jbr.ioexamples.fileoperations;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

/**
 * A simple example to read the bz2 file.
 */
public class ReadBz2File {

  public static void main(String[] args) {
    String bz2File = "testdata/fileoperations/myfile.bz2";
    CompressorInputStream compressorInputStream = null;

    try {
      BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(bz2File));
      compressorInputStream = new CompressorStreamFactory().createCompressorInputStream(bufferedInputStream);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(compressorInputStream));

      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (CompressorException | IOException e) {
      e.printStackTrace();
    }
  }

}
