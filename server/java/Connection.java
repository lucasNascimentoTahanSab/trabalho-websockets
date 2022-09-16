package server.java;

import java.net.*;
import java.io.*;

public class Connection extends Thread {
  Socket client;
  DataOutputStream clientOutputStream;
  DataInputStream clientInputStream;

  public Connection(final Socket CLIENT) {
    this.stablishConnection(CLIENT);
  }

  /**
   * Método responsável por estabelecer conexão com o cliente recebido.
   * 
   * @param CLIENT
   */
  void stablishConnection(final Socket CLIENT) {
    try {
      this.client = CLIENT;
      this.clientOutputStream = new DataOutputStream(this.client.getOutputStream());
      this.clientInputStream = new DataInputStream(this.client.getInputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Método executado na recepção do cliente para responder às opções
   * selecionadas.
   */
  public void run() {
    Integer optionId = Option.LISTENING.id;

    while ((optionId = this.readInteger()) != Option.CANCEL.id) {
      Option.triggerActionFor(optionId).handle(this.client);
    }
  }

  /**
   * Método responsável pela leitura de um inteiro do cliente.
   * 
   * @return
   */
  Integer readInteger() {
    try {
      return this.clientInputStream.readInt();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return 0;
  }
}
