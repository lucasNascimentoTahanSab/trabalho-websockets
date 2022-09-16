package client.java;

import java.net.Socket;

public class InspectAction extends Action {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para inpeção do evento.
   */
  @Override
  public String handle(final Socket CLIENT) {
    super.request(Option.INSPECT, CLIENT);

    return super.response(CLIENT);
  }
}
