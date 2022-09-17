package server.java;

import java.net.Socket;

public class ShowAction extends Action {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para apresentação dos eventos.
   * 
   * @param CLIENT
   */
  @Override
  public void handle(final Socket CLIENT) {
    super.response(EventDatabase.getEvents(), CLIENT);
  }
}
