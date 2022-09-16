package server.java;

import java.net.Socket;

public class InspectAction extends Action {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para inpeção do evento.
   */
  @Override
  public void handle(final Socket CLIENT) {
    super.response("", CLIENT);
  }
}
