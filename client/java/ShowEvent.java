package client.java;

import java.net.Socket;

public class ShowEvent extends Event {
  @Override
  public void handle(final Socket CLIENT) {
    this.request(Option.SHOW, CLIENT);
  }
}
