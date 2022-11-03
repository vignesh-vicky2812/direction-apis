package com.direction.demo.pojo;

import java.util.ArrayList;

import com.direction.demo.pojo.here.Route;

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

	
	

}
