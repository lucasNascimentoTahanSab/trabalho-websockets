package server.java;

import java.net.*;
import java.io.*;

public class Server {
  Integer port;
  ServerSocket server;

  public Server(final Integer PORT) {
    this.port = PORT;

    this.createServer();
    this.openConnections();
  }

  void createServer() {
    try {
      this.server = new ServerSocket(this.port);

      System.out.println("Listening on port " + this.port + "...");
    } catch (IOException error) {
      error.printStackTrace();
    }
  }

  void openConnections() {
    while (true) { openConnection(); }
  }

  void openConnection() {
    try {
      (new Connection(this.server.accept())).start();

      System.out.println("New connection accepted...");
    } catch (IOException error) {
      error.printStackTrace();
    }
  }
}
