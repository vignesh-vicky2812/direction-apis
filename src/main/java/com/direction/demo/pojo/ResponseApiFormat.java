package com.direction.demo.pojo;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseApiFormat {

	@JsonProperty("routes")
	private ArrayList<RouteBean> routes;

	public ResponseApiFormat() {

	}

	public ResponseApiFormat(ArrayList<RouteBean> routes) {
		super();
		this.routes = routes;
	}

	public ArrayList<RouteBean> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<RouteBean> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "ResponseApiFormat [routes=" + routes + "]";
	}

}
