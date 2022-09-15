package client.java;

import java.net.Socket;

public class CancelEvent extends Event {
  @Override
  public byte[] handle(final Socket CLIENT) {
    super.request(Option.CANCEL, CLIENT);

    return super.response(CLIENT);
  }
}
