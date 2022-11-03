package com.direction.demo.pojo.google;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
//@JsonFilter("RoutesFilter")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Route {

	private Bounds bounds;
	private String copyrights;
	private ArrayList<Leg> legs;
	private OverviewPolyline overview_polyline;
	private String summary;
	private ArrayList<String> warnings;
	private ArrayList<Object> waypoint_order;
	public Route() {
		
	}
	public Route(Bounds bounds, String copyrights, ArrayList<Leg> legs, OverviewPolyline overview_polyline,
			String summary, ArrayList<String> warnings, ArrayList<Object> waypoint_order) {
		super();
		this.bounds = bounds;
		this.copyrights = copyrights;
		this.legs = legs;
		this.overview_polyline = overview_polyline;
		this.summary = summary;
		this.warnings = warnings;
		this.waypoint_order = waypoint_order;
	}
	public Bounds getBounds() {
		return bounds;
	}
	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}
	public String getCopyrights() {
		return copyrights;
	}
	public void setCopyrights(String copyrights) {
		this.copyrights = copyrights;
	}
	public ArrayList<Leg> getLegs() {
		return legs;
	}
	public void setLegs(ArrayList<Leg> legs) {
		this.legs = legs;
	}
	public OverviewPolyline getOverview_polyline() {
		return overview_polyline;
	}
	public void setOverview_polyline(OverviewPolyline overview_polyline) {
		this.overview_polyline = overview_polyline;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public ArrayList<String> getWarnings() {
		return warnings;
	}
	public void setWarnings(ArrayList<String> warnings) {
		this.warnings = warnings;
	}
	public ArrayList<Object> getWaypoint_order() {
		return waypoint_order;
	}
	public void setWaypoint_order(ArrayList<Object> waypoint_order) {
		this.waypoint_order = waypoint_order;
	}
	@Override
	public String toString() {
		return "Route [bounds=" + bounds + ", copyrights=" + copyrights + ", legs=" + legs + ", overview_polyline="
				+ overview_polyline + ", summary=" + summary + ", warnings=" + warnings + ", waypoint_order="
				+ waypoint_order + "]";
	}
	
}
