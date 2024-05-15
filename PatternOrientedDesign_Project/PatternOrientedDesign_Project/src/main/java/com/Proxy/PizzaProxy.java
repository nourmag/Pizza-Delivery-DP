package com.Proxy;

import java.util.List;

import com.Pizza;

public class PizzaProxy {
	private Pizza pizza;
	
	public PizzaProxy(String size , String crust , List<String> toppings) {
		pizza = new Pizza(size, crust, toppings);
		
	}
	
	public PizzaProxy() {
		//Default Constructor
	}
	
	public String getSize()
	{
		return pizza.getSize();
	}
	
	public String getCrust()
	{
		return pizza.getCrust();
	}
	
	public List<String> getToppings()
	{
		return pizza.getToppings();
	}
	
	public void prepare() {
		pizza.prepare();
	}
	
	public void deliver() {
		pizza.deliver();
	}
	
	public void received()
	{
		pizza.received();
	}

}
