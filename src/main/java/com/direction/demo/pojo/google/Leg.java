package com.direction.demo.pojo.google;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Leg {
	private ArrivalTime arrival_time;
    private DepartureTime departure_time;
    private Distance distance;
    private Duration duration;
    private String end_address;
    private EndLocation end_location;
    private String start_address;
    private StartLocation start_location;
    
    @JsonProperty("steps")
    private ArrayList<StepObject> steps;
    private ArrayList<Object> traffic_speed_entry;
    private ArrayList<Object> via_waypoint;
    public Leg() {
    	
    }
	public Leg(ArrivalTime arrival_time, DepartureTime departure_time, Distance distance, Duration duration,
			String end_address, EndLocation end_location, String start_address, StartLocation start_location,
			ArrayList<StepObject> steps, ArrayList<Object> traffic_speed_entry, ArrayList<Object> via_waypoint) {
		super();
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.distance = distance;
		this.duration = duration;
		this.end_address = end_address;
		this.end_location = end_location;
		this.start_address = start_address;
		this.start_location = start_location;
		this.steps = steps;
		this.traffic_speed_entry = traffic_speed_entry;
		this.via_waypoint = via_waypoint;
	}
	public ArrivalTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(ArrivalTime arrival_time) {
		this.arrival_time = arrival_time;
	}
	public DepartureTime getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(DepartureTime departure_time) {
		this.departure_time = departure_time;
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
	public String getEnd_address() {
		return end_address;
	}
	public void setEnd_address(String end_address) {
		this.end_address = end_address;
	}
	public EndLocation getEnd_location() {
		return end_location;
	}
	public void setEnd_location(EndLocation end_location) {
		this.end_location = end_location;
	}
	public String getStart_address() {
		return start_address;
	}
	public void setStart_address(String start_address) {
		this.start_address = start_address;
	}
	public StartLocation getStart_location() {
		return start_location;
	}
	public void setStart_location(StartLocation start_location) {
		this.start_location = start_location;
	}
	public ArrayList<StepObject> getSteps() {
		return steps;
	}
	public void setSteps(ArrayList<StepObject> steps) {
		this.steps = steps;
	}
	public ArrayList<Object> getTraffic_speed_entry() {
		return traffic_speed_entry;
	}
	public void setTraffic_speed_entry(ArrayList<Object> traffic_speed_entry) {
		this.traffic_speed_entry = traffic_speed_entry;
	}
	public ArrayList<Object> getVia_waypoint() {
		return via_waypoint;
	}
	public void setVia_waypoint(ArrayList<Object> via_waypoint) {
		this.via_waypoint = via_waypoint;
	}
	@Override
	public String toString() {
		return "Leg [arrival_time=" + arrival_time + ", departure_time=" + departure_time + ", distance=" + distance
				+ ", duration=" + duration + ", end_address=" + end_address + ", end_location=" + end_location
				+ ", start_address=" + start_address + ", start_location=" + start_location + ", steps=" + steps
				+ ", traffic_speed_entry=" + traffic_speed_entry + ", via_waypoint=" + via_waypoint + "]";
	}
}
