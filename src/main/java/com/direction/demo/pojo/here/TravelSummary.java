package com.direction.demo.pojo.here;
public class TravelSummary{
    private int duration;
    private int length;
    public TravelSummary() {
    	
    }
	public TravelSummary(int duration, int length) {
		super();
		this.duration = duration;
		this.length = length;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
    
}