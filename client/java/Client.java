package client.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
  final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  Socket client;

  public Client(final String HOST, final Integer PORT) {
    this.stablishConnection(HOST, PORT);
    this.communicate();
  }

  /**
   * Método responsável pela comunicação entre cliente e servidor.
   */
  void communicate() {
    String option = this.readOption();

    while (option != null && option.compareTo(Option.CANCEL.id) != 0) {
      this.handleResponse(Option.triggerActionFor(option).handle(this.client));
      option = this.readOption();
    }

    this.close();
  }

  void close() {
    try {
      this.client.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Método responsável por lidar com o corpo da resposta obtida.
   * 
   * @param RESPONSE
   */
  void handleResponse(final String RESPONSE) {
    if (RESPONSE == null || RESPONSE.isEmpty()) {
      return;
    }

    System.out.println(RESPONSE);
  }

  /**
   * Método responsável pela leitura de um inteiro do terminal.
   * 
   * @return
   */
  String readOption() {
    try {
      System.out.print("Número da opção: ");

      return READER.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "";
  }

  /**
   * Método responsável pelo estabelecimento de conexão com o servidor em
   * host:port.
   * 
   * @param HOST
   * @param PORT
   */
  void stablishConnection(final String HOST, final Integer PORT) {
    try {
      this.client = new Socket(HOST, PORT);

      System.out.println("Connection stablished...");
    } catch (IOException error) {
      error.printStackTrace();
    }
  }
}
