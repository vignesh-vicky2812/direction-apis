package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArrivalTime {
	private String text;
	private String time_zone;
	private int value;
	public ArrivalTime() {
		
	}
	public ArrivalTime(String text, String time_zone, int value) {
		super();
		this.text = text;
		this.time_zone = time_zone;
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ArrivalTime [text=" + text + ", time_zone=" + time_zone + ", value=" + value + "]";
	}
	

}
