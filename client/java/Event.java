package client.java;

import java.net.*;
import java.io.*;

public class Event {
  protected void request(final Option OPTION, final Socket CLIENT) {
    try {
      CLIENT.getOutputStream().write(OPTION.id);
    } catch (IOException erro) {
      erro.printStackTrace();
    }
  }

  public void handle(Socket client) { }
}
