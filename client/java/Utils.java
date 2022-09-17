package client.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
  final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

  /**
   * Método responsável pela leitura de um inteiro do terminal.
   * 
   * @param MESSAGE
   * @return
   */
  static String readLine(final String MESSAGE) {
    try {
      System.out.print(MESSAGE);

      return READER.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "";
  }
}
