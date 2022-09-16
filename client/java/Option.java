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
  public static Event triggerEventFor(final Integer ID) {
    if (ID == Option.SHOW.id) { return new ShowEvent(); }
    if (ID == Option.INSPECT.id) { return new InspectEvent(); }
    if (ID == Option.BUY.id) { return new BuyEvent(); }

    return new CancelEvent();
  }
}
