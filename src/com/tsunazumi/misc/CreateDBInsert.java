package com.tsunazumi.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDBInsert {

  public static void main(String[] args) throws IOException {
    String input = "src/sandbox/input.txt";
    String output = "src/sandbox/output.txt";
    
    new File(output).delete();

    BufferedReader br = null;
    FileReader fr = null;
    BufferedWriter bw = null;
    FileWriter fw = null;

    try {

      fr = new FileReader(input);
      br = new BufferedReader(fr);
      fw = new FileWriter(output);
      bw = new BufferedWriter(fw);

      String sCurrentLine;

      int index = 0;
      while ((sCurrentLine = br.readLine()) != null) {
        index++;
        bw.write("INSERT INTO AMP_PRODUCT (AMP_PRO_ID) VALUES (" + sCurrentLine +")\n");
        bw.write("/\n");
        if (index % 500 == 0) {
          bw.write("COMMIT\n");
          bw.write("/\n");
        }

      }

    } catch (IOException e) {

    } finally {
      bw.close();
      fw.close();
      br.close();
      bw.close();
    }


  }

}
