package server.java;

import java.net.Socket;

public class BuyEvent extends Event {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para compra de ingresso.
   */
  @Override
  public void handle(final Socket CLIENT) {
    super.response("", CLIENT);
  }
}
