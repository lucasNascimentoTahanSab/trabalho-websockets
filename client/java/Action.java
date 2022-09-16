package client.java;

import java.net.*;
import java.io.*;

public class Action {
  /**
   * Método responsável pela execução da opção escolhida pelo cliente em
   * comunicação com o servidor.
   * 
   * @param OPTION
   * @param CLIENT
   */
  protected void request(final Option OPTION, final Socket CLIENT) {
    try {
      (new DataOutputStream(CLIENT.getOutputStream())).writeInt(OPTION.id);
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
