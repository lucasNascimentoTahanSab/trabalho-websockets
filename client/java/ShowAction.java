package client.java;

import java.net.Socket;

public class ShowAction extends Action {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para apresentação dos eventos.
   * 
   * @param CLIENT
   * @returns
   */
  @Override
  public String handle(final Socket CLIENT) {
    super.request(Option.SHOW.id, CLIENT);

    return super.response(CLIENT);
  }
}
