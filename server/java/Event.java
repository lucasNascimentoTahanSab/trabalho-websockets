package server.java;

import java.io.Serializable;
import java.time.*;

public class Event implements Serializable {
  public String id;
  public LocalDate start_date;
  public LocalDate end_date;
  public Double price;
  public Integer stock_quantity;
  public String name;
  public String detail;
  public Address address;

  public Event(
      String id,
      LocalDate start_date,
      LocalDate end_date,
      Double price,
      Integer stock_quantity,
      String name,
      String detail,
      String address_name,
      String address,
      String address_num,
      String neighborhood,
      String city,
      String state,
      String zip_code) {
    this.id = id;
    this.start_date = start_date;
    this.end_date = end_date;
    this.price = price;
    this.stock_quantity = stock_quantity;
    this.name = name;
    this.detail = detail;
    this.address = new Address(
        address_name,
        address,
        address_num,
        neighborhood,
        city,
        state,
        zip_code);
  }

  public class Address {
    public String name;
    public String address;
    public String address_num;
    public String neighborhood;
    public String city;
    public String state;
    public String zip_code;

    public Address(
        String name,
        String address,
        String address_num,
        String neighborhood,
        String city,
        String state,
        String zip_code) {
      this.name = name;
      this.address = address;
      this.address_num = address_num;
      this.neighborhood = neighborhood;
      this.city = city;
      this.state = state;
      this.zip_code = zip_code;
    }
  }
}
