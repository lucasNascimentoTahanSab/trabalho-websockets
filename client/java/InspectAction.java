package client.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InspectAction extends Action {
  final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

  /**
   * Método responsável por lidar com as requisições por parte do cliente ao
   * servidor, retornando a resposta obtida para inpeção do evento.
   */
  @Override
  public String handle(final Socket CLIENT) {
    super.request(Option.INSPECT.id, CLIENT);
    super.request(this.readLine(), CLIENT);

    return super.response(CLIENT);
  }

  /**
   * Método responsável pela leitura de um inteiro do terminal.
   * 
   * @return
   */
  String readLine() {
    try {
      System.out.print("Nome do evento: ");

      return READER.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "";
  }
}
