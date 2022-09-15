package client.java;

import java.net.Socket;

public class ShowEvent extends Event {
  @Override
  public byte[] handle(final Socket CLIENT) {
    super.request(Option.SHOW, CLIENT);

    return super.response(CLIENT);
  }
}
