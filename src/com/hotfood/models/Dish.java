package com.hotfood.models;

import java.util.ArrayList;
import java.util.List;

public class Dish {
	private String id;
	private String name;
	private String description;
	private String[] options;
	private double price;
	
	public Dish(String id,String name,String description,String[] options,double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.options = options;
		this.price = price;
	}
	
	public Dish(Dish dish) {
		this.id = dish.getId();
		this.name = dish.getName();
		this.description = dish.getDescription();
		this.options = dish.getOptions();
		this.price = dish.getPrice();
	}
	
	public Dish(String[] details) {
		if(details.length >= 8) {
			this.id = details[0];
			this.name = details[1];
			this.description = details[2];
			this.options = new String[] {details[3],details[4],details[5],details[6]};
			this.price = Double.parseDouble(details[7]);
		}
	}

	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String[] getOptions() {
		return this.options;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		ArrayList<String> values = new ArrayList<String>();
	    values.add(id);
	    values.add(name);
	    values.add(description);
	    for(int i=0;i<options.length;i++) {
	    	values.add(options[i]);
	    }
	    values.add(String.valueOf(price));
	    return String.join(",", values);
	}
	
}
