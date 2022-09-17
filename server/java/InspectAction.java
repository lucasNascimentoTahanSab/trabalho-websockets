package server.java;

import java.net.Socket;

public class InspectAction extends Action {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para inpeção do evento.
   * 
   * @param CLIENT
   */
  @Override
  public void handle(final Socket CLIENT) {
    String eventName = super.request(CLIENT);

    super.response(EventDatabase.getEventByName(eventName), CLIENT);
  }
}
