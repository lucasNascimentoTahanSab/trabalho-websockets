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
    try {
      this.clientInputStream = this.client.getInputStream();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  void initializeClientInputStream() {
    try {
      this.clientInputStream = this.client.getInputStream();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void run() {
  }
}
