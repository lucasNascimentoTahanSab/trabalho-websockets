package server.java;

import java.net.*;
import java.io.*;

public class Connection extends Thread {
  Socket client;
  OutputStream clientOutputStream;
  InputStream clientInputStream;

  public Connection(final Socket CLIENT) {
    this.client = CLIENT;
    this.initializeClientInputStream();
    this.initializeClientOutputStream();
  }

  void initializeClientOutputStream() {
    try { this.clientOutputStream = this.client.getOutputStream(); } 
    catch (IOException error) { error.printStackTrace(); }
  }

  void initializeClientInputStream() {
    try { this.clientInputStream = this.client.getInputStream(); } 
    catch (IOException error) { error.printStackTrace(); }
  }

  public void run() {
    Integer optionId = Option.LISTENING.id;

    while ((optionId = this.readInteger()) != Option.CANCEL.id) {
      Option.triggerEventFor(optionId).handle(this.client);
    }
  }

  Integer readInteger() {
    try { return this.clientInputStream.read(); } 
    catch (IOException error) { }

    return 0;
  }
}
