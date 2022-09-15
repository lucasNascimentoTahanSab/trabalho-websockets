package client.java;

import java.net.Socket;

public class BuyEvent extends Event {
  @Override
  public void handle(final Socket CLIENT) {
    this.request(Option.BUY, CLIENT);
  }
}
