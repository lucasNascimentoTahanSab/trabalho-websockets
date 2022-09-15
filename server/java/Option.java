package server.java;

public enum Option {
  LISTENING(0),
  SHOW(1),
  INSPECT(2),
  BUY(3),
  CANCEL(4);

  public Integer id;

  Option(final Integer ID) {
    this.id = ID;
  }

  public static Event triggerEventFor(final Integer ID) {
    if (ID == Option.SHOW.id) { return new ShowEvent(); }
    if (ID == Option.INSPECT.id) { return new InspectEvent(); }
    if (ID == Option.BUY.id) { return new BuyEvent(); }
    
    return new CancelEvent();
  }
}
