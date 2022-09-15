package server.java;

public class App {
  static final Integer PORT = 8080;

  public static void main(String[] args) {
    new Server(PORT);
  }
}
