package client.java;

import java.net.Socket;

public class InspectEvent extends Event {
  @Override
  public byte[] handle(final Socket CLIENT) {
    super.request(Option.INSPECT, CLIENT);

    return super.response(CLIENT);
  }
}
