package com.Builder;

import java.util.ArrayList;
import java.util.List;

import com.Pizza;

public class PizzaBuilder {
  private String size;
  private String crust;
  private List<String> toppings;
  private String bill_id;
  private String order_id;
  private float total_price;
  private String paymentway;
  private String cname;
  private String ename;
  
  public PizzaBuilder() {
    toppings=new ArrayList<>();
  }
  public PizzaBuilder setEname(String ename) {
    this.ename=ename;
    return this;
  }
  public PizzaBuilder setCname(String cname) {
    this.cname=cname;
    return this;
  }
  public PizzaBuilder setPaymentWay(String paymentway) {
    this.paymentway=paymentway;
    return this;
  }
  public PizzaBuilder setTotalPrice(float total_price) {
    this.total_price=total_price;
    return this;
  }
  public PizzaBuilder setOrderId(String order_id) {
    this.order_id=order_id;
    return this;
  }
  public PizzaBuilder setSize(String size) {
    this.size=size;
    return this;
  }
  public PizzaBuilder setBillId(String bill_id) {
    this.bill_id=bill_id;
    return this;
  }
  
  public PizzaBuilder setCrust(String crust) {
	  this.crust=crust;
	  return this;
  }
  public PizzaBuilder addTopping(String topping) {
    toppings.add(topping);
    return this;
  }
  
  public Pizza build() {
    return new Pizza(size, crust, toppings ,bill_id , order_id,total_price,paymentway,cname,ename);
  }
}