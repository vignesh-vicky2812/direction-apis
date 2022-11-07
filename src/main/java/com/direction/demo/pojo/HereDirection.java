package com.direction.demo.pojo;

import java.util.ArrayList;

import com.direction.demo.pojo.here.Route;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HereDirection {
	private ArrayList<Route> routes;
	
	public HereDirection() {
		
	}
	
	public HereDirection(ArrayList<Route> routes) {
		super();
		this.routes = routes;
	}

	public ArrayList<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "HereDirection [routes=" + routes + "]";
	}

	
	

}
