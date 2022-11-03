package com.direction.demo.pojo.google;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Line {
	
	private ArrayList<Agency> agencies;
    private String color;
    private String name;
    private String short_name;
    private String text_color;
    private Vehicle vehicle;
    public Line() {
    	
    }
	public Line(ArrayList<Agency> agencies, String color, String name, String short_name, String text_color,
			Vehicle vehicle) {
		super();
		this.agencies = agencies;
		this.color = color;
		this.name = name;
		this.short_name = short_name;
		this.text_color = text_color;
		this.vehicle = vehicle;
	}
	public ArrayList<Agency> getAgencies() {
		return agencies;
	}
	public void setAgencies(ArrayList<Agency> agencies) {
		this.agencies = agencies;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getText_color() {
		return text_color;
	}
	public void setText_color(String text_color) {
		this.text_color = text_color;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Line [agencies=" + agencies + ", color=" + color + ", name=" + name + ", short_name=" + short_name
				+ ", text_color=" + text_color + ", vehicle=" + vehicle + "]";
	}

}
