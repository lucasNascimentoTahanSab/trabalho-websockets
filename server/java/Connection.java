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
    String option = this.readOption();

    while (option != null && option.compareTo(Option.CANCEL.id) != 0) {
      Option.triggerActionFor(option).handle(this.client);
      option = this.readOption();
    }

    this.close();
  }

  void close() {
    try {
      System.out.println("Closed connection with " + this.client.toString() + "...");

      this.client.close();
      this.clientInputStream.close();
      this.clientOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Método responsável pela leitura de um inteiro do cliente.
   * 
   * @return
   */
  String readOption() {
    try {
      return this.clientInputStream.readUTF();
    } catch (IOException e) {
      return Option.CANCEL.id;
    }
  }
}
