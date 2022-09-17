package server.java;

import java.net.Socket;

public class BuyAction extends Action {
  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para compra de ingresso.
   * 
   * @param CLIENT
   */
  @Override
  public void handle(final Socket CLIENT) {
    String eventName = super.request(CLIENT);

    super.response(EventDatabase.buyTicketFor(eventName), CLIENT);
  }
}
