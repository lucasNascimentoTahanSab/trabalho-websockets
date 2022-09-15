package server.java;

import java.net.Socket;

public class ShowEvent extends Event {
  @Override
  public void handle(final Socket CLIENT) {
    this.response("", CLIENT);
  }
}
