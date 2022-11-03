package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartureStop {
	
	private Location location;
    private String name;
    public DepartureStop() {
    	
    }
	public DepartureStop(Location location, String name) {
		super();
		this.location = location;
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DepartureStop [location=" + location + ", name=" + name + "]";
	}
    
    

}
