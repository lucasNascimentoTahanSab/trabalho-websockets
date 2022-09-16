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
    Integer optionId = this.readInteger();

    do {
      this.handleResponse(Option.triggerEventFor(optionId).handle(this.client));
    } while ((optionId = this.readInteger()) != Option.CANCEL.id);
  }

  /**
   * Método responsável por lidar com o corpo da resposta obtida.
   * 
   * @param RESPONSE
   */
  void handleResponse(final String RESPONSE) {
    System.out.println(RESPONSE);
  }

  /**
   * Método responsável pela leitura de um inteiro do terminal.
   * 
   * @return
   */
  Integer readInteger() {
    try {
      return Integer.valueOf(READER.readLine());
    } catch (NumberFormatException | IOException e) {
      e.printStackTrace();
    }

    return 0;
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
