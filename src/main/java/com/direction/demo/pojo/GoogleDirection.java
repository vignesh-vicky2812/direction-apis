package com.direction.demo.pojo;

import java.util.ArrayList;

import com.direction.demo.pojo.google.GeocodedWaypoint;
import com.direction.demo.pojo.google.Route;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class GoogleDirection {
	@JsonIgnore
	private ArrayList<GeocodedWaypoint> geocoded_waypoints;
	
	private ArrayList<Route> routes;
	
	@JsonIgnore
	private String status;
	
	public GoogleDirection() {
		
	}
	public GoogleDirection(ArrayList<GeocodedWaypoint> geocoded_waypoints, ArrayList<Route> routes, String status) {
		super();
		this.geocoded_waypoints = geocoded_waypoints;
		this.routes = routes;
		this.status = status;
	}
	public ArrayList<GeocodedWaypoint> getGeocoded_waypoints() {
		return geocoded_waypoints;
	}
	public void setGeocoded_waypoints(ArrayList<GeocodedWaypoint> geocoded_waypoints) {
		this.geocoded_waypoints = geocoded_waypoints;
	}
	public ArrayList<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GoogleDirection [geocoded_waypoints=" + geocoded_waypoints + ", routes=" + routes + ", status=" + status
				+ "]";
	}
	

}
