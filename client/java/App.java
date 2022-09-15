package client.java;

public class App {
  static final String HOST = "127.0.0.1";
  static final Integer PORT = 8080;

  public static void main(String[] args) {
    new Client(HOST, PORT);
  }
}
