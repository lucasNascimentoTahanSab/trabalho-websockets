package client.java;

import java.net.*;
import java.io.*;

public class Event {
  protected void request(final Option OPTION, final Socket CLIENT) {
    try { CLIENT.getOutputStream().write(OPTION.id); } 
    catch (IOException error) { error.printStackTrace(); }
  }

  protected byte[] response(final Socket CLIENT) {
    try { return CLIENT.getInputStream().readAllBytes(); } 
    catch (IOException error) { }

    return null;
  }

  public  byte[] handle(Socket client) {
    return null;
  }
}
