package client.java;

public enum Option {
  SHOW("1"),
  INSPECT("2"),
  BUY("3"),
  CANCEL("4");

  public String id;

  Option(final String ID) {
    this.id = ID;
  }

  /**
   * Método responsável pela obtenção do evento correspondente à opção escolhida
   * pelo cliente para requisição ao servidor.
   * 
   * @param ID
   * @return
   */
  public static Action triggerActionFor(final String ID) {
    if (ID == null) {
      return new Action();
    }

    if (ID.compareTo(Option.SHOW.id) == 0) {
      return new ShowAction();
    }
    if (ID.compareTo(Option.INSPECT.id) == 0) {
      return new InspectAction();
    }
    if (ID.compareTo(Option.BUY.id) == 0) {
      return new BuyAction();
    }

    return new Action();
  }
}
