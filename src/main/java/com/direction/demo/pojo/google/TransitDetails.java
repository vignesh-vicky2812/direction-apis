package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransitDetails {
	
	private ArrivalStop arrival_stop;
    private ArrivalTime arrival_time;
    private DepartureStop departure_stop;
    private DepartureTime departure_time;
    private String headsign;
    private Line line;
    private int num_stops;
    public TransitDetails() {
    	
    }
	public TransitDetails(ArrivalStop arrival_stop, ArrivalTime arrival_time, DepartureStop departure_stop,
			DepartureTime departure_time, String headsign, Line line, int num_stops) {
		super();
		this.arrival_stop = arrival_stop;
		this.arrival_time = arrival_time;
		this.departure_stop = departure_stop;
		this.departure_time = departure_time;
		this.headsign = headsign;
		this.line = line;
		this.num_stops = num_stops;
	}
	public ArrivalStop getArrival_stop() {
		return arrival_stop;
	}
	public void setArrival_stop(ArrivalStop arrival_stop) {
		this.arrival_stop = arrival_stop;
	}
	public ArrivalTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(ArrivalTime arrival_time) {
		this.arrival_time = arrival_time;
	}
	public DepartureStop getDeparture_stop() {
		return departure_stop;
	}
	public void setDeparture_stop(DepartureStop departure_stop) {
		this.departure_stop = departure_stop;
	}
	public DepartureTime getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(DepartureTime departure_time) {
		this.departure_time = departure_time;
	}
	public String getHeadsign() {
		return headsign;
	}
	public void setHeadsign(String headsign) {
		this.headsign = headsign;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public int getNum_stops() {
		return num_stops;
	}
	public void setNum_stops(int num_stops) {
		this.num_stops = num_stops;
	}
	@Override
	public String toString() {
		return "TransitDetails [arrival_stop=" + arrival_stop + ", arrival_time=" + arrival_time + ", departure_stop="
				+ departure_stop + ", departure_time=" + departure_time + ", headsign=" + headsign + ", line=" + line
				+ ", num_stops=" + num_stops + "]";
	}
    

}
