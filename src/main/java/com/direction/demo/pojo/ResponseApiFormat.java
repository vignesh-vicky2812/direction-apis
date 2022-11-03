package com.direction.demo.pojo;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseApiFormat {

	@JsonProperty("routes")
	private ArrayList<RouteObject> routes;

	public ResponseApiFormat() {

	}

	public ResponseApiFormat(ArrayList<RouteObject> routes) {
		super();
		this.routes = routes;
	}

	public ArrayList<RouteObject> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<RouteObject> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "ResponseApiFormat [routes=" + routes + "]";
	}

}
