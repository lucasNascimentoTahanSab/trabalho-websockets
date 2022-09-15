package server.java;

import java.net.Socket;

public class BuyEvent extends Event {
  @Override
  public void handle(final Socket CLIENT) {
    super.response("", CLIENT);
  }
}
