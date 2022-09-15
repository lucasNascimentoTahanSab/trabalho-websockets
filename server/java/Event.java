package server.java;

import java.net.*;
import java.io.*;

public class Event {
  protected void response(final String RESPONSE, final Socket CLIENT) {
    try {
      CLIENT.getOutputStream().write(RESPONSE.getBytes());
    } catch (IOException erro) {
      erro.printStackTrace();
    }
  }

  public void handle(Socket client) {
  }
}
