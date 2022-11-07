package com.direction.demo.pojo.here;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Departure {
	public Date time;
	public Place place;
	public int delay;
	public Departure() {
		
	}
	
	public Departure(Date time, Place place, int delay) {
		super();
		this.time = time;
		this.place = place;
		this.delay = delay;
	}

	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}

	@Override
	public String toString() {
		return "Departure [time=" + time + ", place=" + place + ", delay=" + delay + "]";
	}
}
