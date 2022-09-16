package client.java;

public enum Option {
  SHOW(1),
  INSPECT(2),
  BUY(3),
  CANCEL(4);

  public Integer id;

  Option(final Integer ID) {
    this.id = ID;
  }

  /**
   * Método responsável pela obtenção do evento correspondente à opção escolhida
   * pelo cliente para requisição ao servidor.
   * 
   * @param ID
   * @return
   */
  public static Action triggerActionFor(final Integer ID) {
    if (ID == Option.SHOW.id) {
      return new ShowAction();
    }
    if (ID == Option.INSPECT.id) {
      return new InspectAction();
    }
    if (ID == Option.BUY.id) {
      return new BuyAction();
    }

    return new CancelAction();
  }
}
