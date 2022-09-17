package client.java;

import java.net.*;
import java.io.*;

public class Action {
  /**
   * Método responsável pelo envio de mensagem do cliente ao servidor.
   * 
   * @param OPTION
   * @param CLIENT
   */
  protected void request(final String MESSAGE, final Socket CLIENT) {
    try {
      (new DataOutputStream(CLIENT.getOutputStream())).writeUTF(MESSAGE);
    } catch (IOException error) {
      error.printStackTrace();
    }
  }

  /**
   * Método responsável pela obtenção de resposta do servidor quanto à requisição
   * realizada pelo cliente.
   * 
   * @param CLIENT
   * @return
   */
  protected String response(final Socket CLIENT) {
    try {
      return (new DataInputStream(CLIENT.getInputStream())).readUTF();
    } catch (IOException error) {
      error.printStackTrace();
    }

    return null;
  }

  public String handle(Socket client) {
    return null;
  }
}
