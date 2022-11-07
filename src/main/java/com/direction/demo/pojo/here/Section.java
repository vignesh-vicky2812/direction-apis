package com.direction.demo.pojo.here;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonFilter("SectionFilter")
public class Section {
	private String id;
	private String type;
	private ArrayList<Action> actions;
	private TravelSummary travelSummary;
	private Departure departure;
	private Arrival arrival;
	private String polyline;
	private Transport transport;
	private ArrayList<IntermediateStop> intermediateStops;
	private Agency agency;

	public Section() {

	}

	public Section(String id, String type, ArrayList<Action> actions, TravelSummary travelSummary, Departure departure,
			Arrival arrival, String polyline, Transport transport, ArrayList<IntermediateStop> intermediateStops,
			Agency agency) {
		super();
		this.id = id;
		this.type = type;
		this.actions = actions;
		this.travelSummary = travelSummary;
		this.departure = departure;
		this.arrival = arrival;
		this.polyline = polyline;
		this.transport = transport;
		this.intermediateStops = intermediateStops;
		this.agency = agency;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public TravelSummary getTravelSummary() {
		return travelSummary;
	}

	public void setTravelSummary(TravelSummary travelSummary) {
		this.travelSummary = travelSummary;
	}

	public Departure getDeparture() {
		return departure;
	}

	public void setDeparture(Departure departure) {
		this.departure = departure;
	}

	public Arrival getArrival() {
		return arrival;
	}

	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}

	public String getPolyline() {
		return polyline;
	}

	public void setPolyline(String polyline) {
		this.polyline = polyline;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public ArrayList<IntermediateStop> getIntermediateStops() {
		return intermediateStops;
	}

	public void setIntermediateStops(ArrayList<IntermediateStop> intermediateStops) {
		this.intermediateStops = intermediateStops;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	@Override
	public String toString() {
		return "Section [id=" + id + ", type=" + type + ", actions=" + actions + ", travelSummary=" + travelSummary
				+ ", departure=" + departure + ", arrival=" + arrival + ", polyline=" + polyline + ", transport="
				+ transport + ", intermediateStops=" + intermediateStops + ", agency=" + agency + "]";
	}

}
