package com;

import java.util.List;

public class Pizza {
	private String size;
	private String crust;
	private List<String> toppings;

	public Pizza(String size, String crust, List<String> toppings) {
		this.size = size;
		this.crust = crust;
		this.toppings = toppings;
	}

	public Pizza() {

	}

	public String getSize() {
		return size;
	}

	public String getCrust() {
		return crust;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public String prepare() {
		return "Preparing pizza...";
	}

	public String deliver() {
		return "Delivering pizza...";
	}

	public String received() {
		return "Pizza received...";
	}
}
