package client.java;

import java.net.Socket;

public class BuyEvent extends Event {
  @Override
  public byte[] handle(final Socket CLIENT) {
    super.request(Option.BUY, CLIENT);

    return super.response(CLIENT);
  }
}
