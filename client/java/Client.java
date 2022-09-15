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

  void stablishConnection(final String HOST, final Integer PORT) {
    try { this.client = new Socket(HOST, PORT); } 
    catch (IOException error) { error.printStackTrace(); }
  }

  void communicate() {
    Integer optionId = readInteger();

    do {
      byte[] response = Option.triggerEventFor(optionId).handle(this.client);
    } while ((optionId = readInteger()) != Option.CANCEL.id);
  }

  Integer readInteger() {
    try { return READER.read(); } 
    catch (IOException error) { }

    return 0;
  }
}
