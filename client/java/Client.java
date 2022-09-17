package client.java;

import java.io.IOException;
import java.net.Socket;

public class Client {
  Socket client;

  public Client(final String HOST, final Integer PORT) {
    this.stablishConnection(HOST, PORT);
    this.communicate();
  }

  /**
   * Método responsável pela comunicação entre cliente e servidor.
   */
  void communicate() {
    this.showOptions();
    String option = Utils.readLine("Número da opção: ");

    while (option != null && option.compareTo(Option.CANCEL.id) != 0) {
      this.handleResponse(Option.triggerActionFor(option).handle(this.client));
      this.showOptions();
      option = Utils.readLine("Número da opção: ");
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

    System.out.println("\n" + RESPONSE + "\n");
  }

  void showOptions() {
    System.out.println("Opções: \n\n" +
        "1. Apresentar eventos\n" +
        "2. Apresentar detalhes de um evento\n" +
        "3. Comprar ingresso para evento\n" +
        "4. Sair\n");
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

      System.out.println("\nBem vindo ao evento.com!\n");
    } catch (IOException error) {
      error.printStackTrace();
    }
  }
}
