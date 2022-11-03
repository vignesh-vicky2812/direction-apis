package com.direction.demo.pojo.here;

import java.util.Date;

public class Arrival {
	
	private Date time;
    private Place place;
    private int delay;
    public Arrival() {
    	
    }
	public Arrival(Date time, Place place, int delay) {
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

}
