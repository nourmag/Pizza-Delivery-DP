package com;

import java.util.List;

public class Pizza {
	private String size;
	private List<String> toppings;
	
	public Pizza (String size , List<String> toppings) {
		this.size=size;
		this.toppings=toppings;
	}
	
	public String getSize() {
		return size;
	}
	
	public List<String> getToppings(){
		return toppings;
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
