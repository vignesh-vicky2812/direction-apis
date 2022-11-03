package com.direction.demo.pojo.google;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
//@JsonFilter("StepsFilter")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Step {
	private Distance distance;
    private Duration duration;
    private EndLocation end_location;
    private String html_instructions;
    private Polyline polyline;
    private StartLocation start_location;
    private String travel_mode;
    private TransitDetails transit_details;
    private String maneuver;
    public Step() {
    	
    }
	public Step(Distance distance, Duration duration, EndLocation end_location, String html_instructions,
			Polyline polyline, StartLocation start_location, String travel_mode,
			TransitDetails transit_details, String maneuver) {
		super();
		this.distance = distance;
		this.duration = duration;
		this.end_location = end_location;
		this.html_instructions = html_instructions;
		this.polyline = polyline;
		this.start_location = start_location;
		this.travel_mode = travel_mode;
		this.transit_details = transit_details;
		this.maneuver = maneuver;
	}
	public Distance getDistance() {
		return distance;
	}
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public EndLocation getEnd_location() {
		return end_location;
	}
	public void setEnd_location(EndLocation end_location) {
		this.end_location = end_location;
	}
	public String getHtml_instructions() {
		return html_instructions;
	}
	public void setHtml_instructions(String html_instructions) {
		this.html_instructions = html_instructions;
	}
	public Polyline getPolyline() {
		return polyline;
	}
	public void setPolyline(Polyline polyline) {
		this.polyline = polyline;
	}
	public StartLocation getStart_location() {
		return start_location;
	}
	public void setStart_location(StartLocation start_location) {
		this.start_location = start_location;
	}
	public String getTravel_mode() {
		return travel_mode;
	}
	public void setTravel_mode(String travel_mode) {
		this.travel_mode = travel_mode;
	}
	public TransitDetails getTransit_details() {
		return transit_details;
	}
	public void setTransit_details(TransitDetails transit_details) {
		this.transit_details = transit_details;
	}
	public String getManeuver() {
		return maneuver;
	}
	public void setManeuver(String maneuver) {
		this.maneuver = maneuver;
	}
	@Override
	public String toString() {
		return "Step [distance=" + distance + ", duration=" + duration + ", end_location=" + end_location
				+ ", html_instructions=" + html_instructions + ", polyline=" + polyline + ", start_location="
				+ start_location + ", travel_mode=" + travel_mode + ", transit_details=" + transit_details
				+ ", maneuver=" + maneuver + "]";
	}
	

}
