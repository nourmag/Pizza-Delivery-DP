package com.Proxy;

import java.util.List;

import com.Pizza;

public class PizzaProxy {
	private Pizza pizza;
	
	public PizzaProxy(String size , List<String> toppings) {
		pizza = new Pizza(size, toppings);
	}
	
	public String getSize()
	{
		return pizza.getSize();
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
