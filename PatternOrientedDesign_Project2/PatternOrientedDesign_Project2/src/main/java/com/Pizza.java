package com;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private String size;
  private String crust;
  private List<String> toppings;
  private String bill_id;
  private String order_id;
  private float total_price;
  private String paymentway;
  private String cname;
  private String ename;
  
  public Pizza (String size , String crust, List<String> toppings , String bill_id , String order_id , float total_price , String paymentway , String cname , String ename) {
    this.size=size;
    this.crust=crust;
    this.toppings=new ArrayList<>();
    this.bill_id=bill_id;
    this.order_id=order_id;
    this.total_price=total_price;
    this.paymentway=paymentway;
    this.cname=cname;
    this.ename=ename;
  }
  
  public Pizza() {
      toppings = new ArrayList<>();
  }

  public String getSize() {
      return size;
  }

  public void setSize(String size) {
      this.size = size;
  }

  public String getCrust() {
      return crust;
  }

  public void setCrust(String crust) {
      this.crust = crust;
  }

  public String getEname() {
    return ename;
  }
  
  public void setEname(String ename) {
      this.ename = ename;
  }

  public String getCname() {
    return cname;
  }
  
  public void setCname(String cname) {
      this.cname = cname;
  }

  public String getPaymentWay() {
    return paymentway;
  }
  
  public void setPaymentWay(String paymentway) {
      this.paymentway = paymentway;
  }

  public float getTotalPrice() {
    return total_price;
  }
  
  public void setTotalPrice(float total_price) {
      this.total_price = total_price;
  }

  public String getOrderId() {
    return order_id;
  }
  
  public void setOrderId(String order_id) {
      this.order_id = order_id;
  }
  
  public String getBillId() {
    return bill_id;
  }
  
  public void setBillId(String bill_id) {
      this.bill_id = bill_id;
  }
  
  public List<String> getToppings(){
	  return toppings;
  }
  
  public void addTopping(String topping){
    this.toppings.add(topping);
  }
  
  public void prepare()
  {
    System.out.println("Preparing pizza...");
  }
  public void deliver() {
    System.out.println("Delivering pizza...");
    
  }
  public void received() {
    System.out.println("Pizza Received...");
    
  }
}