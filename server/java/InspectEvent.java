package server.java;

import java.net.Socket;

public class InspectEvent extends Event {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para inpeção do evento.
   */
  @Override
  public void handle(final Socket CLIENT) {
    super.response("", CLIENT);
  }
}
