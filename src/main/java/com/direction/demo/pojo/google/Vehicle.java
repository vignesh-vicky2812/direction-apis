package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vehicle {

	private String icon;
    private String name;
    private String type;
    public Vehicle() {
    	
    }
	public Vehicle(String icon, String name, String type) {
		super();
		this.icon = icon;
		this.name = name;
		this.type = type;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [icon=" + icon + ", name=" + name + ", type=" + type + "]";
	}
}
