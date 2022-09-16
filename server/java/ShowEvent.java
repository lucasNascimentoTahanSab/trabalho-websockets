package server.java;

import java.net.Socket;

public class ShowEvent extends Event {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para apresentação dos eventos.
   */
  @Override
  public void handle(final Socket CLIENT) {
    super.response("Olá esta é uma mensagem de teste.", CLIENT);
  }
}
