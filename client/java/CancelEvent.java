package client.java;

import java.net.Socket;

public class CancelEvent extends Event {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para cancelamento.
   */
  @Override
  public String handle(final Socket CLIENT) {
    super.request(Option.CANCEL, CLIENT);

    return super.response(CLIENT);
  }
}
