package client.java;

import java.net.Socket;

public class BuyEvent extends Event {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para compra de ingresso.
   */
  @Override
  public String handle(final Socket CLIENT) {
    super.request(Option.BUY, CLIENT);

    return super.response(CLIENT);
  }
}
