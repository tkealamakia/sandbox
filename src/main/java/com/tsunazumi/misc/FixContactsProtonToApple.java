package com.tsunazumi.misc;

import java.io.*;

public class FixContactsProtonToApple {
  public static void main(String[] args) {
    String fileName = "protonContacts.vcf";
    String outputFileName = "protonContacts-modified.vcf";
    try (InputStream is = FixContactsProtonToApple.class.getClassLoader().getResourceAsStream(fileName);
         BufferedReader reader = new BufferedReader(new InputStreamReader(is));
         BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
      if (is == null) {
        System.out.println("file not found on the classpath: " + fileName);
      }
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.startsWith("ORG:") ||
            line.startsWith("BDAY") ||
            line.startsWith("ITEM") ||
            line.startsWith("ADR") ||
            line.startsWith("UID")) {
          continue;
        }
        if (line.startsWith("FN;") || line.startsWith("N;")) {
          line = line.replaceAll(";PREF=1", "");
        }
        if (line.startsWith("TEL;")) {
          line = line.replaceAll(";PREF=1", ",voice");
          line = line.replaceAll(";PREF=2", ",voice");
          line = line.replaceAll(";PREF=3", ",voice");
        }
        if (line.startsWith("VERSION:")) {
          line = line.replaceAll("4", "3");
        }
        writer.write(line);
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
