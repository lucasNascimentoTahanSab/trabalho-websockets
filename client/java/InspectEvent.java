package client.java;

import java.net.Socket;

public class InspectEvent extends Event {
  @Override
  public void handle(final Socket CLIENT) {
    this.request(Option.INSPECT, CLIENT);
  }
}
