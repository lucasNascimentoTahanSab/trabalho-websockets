package client.java;

import java.net.Socket;

public class CancelEvent extends Event {
  @Override
  public void handle(final Socket CLIENT) {
    this.request(Option.CANCEL, CLIENT);
  }
}
