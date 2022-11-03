package com.direction.demo.pojo.here;

public class IntermediateStop {
	private Departure departure;

	public IntermediateStop() {
		
	}
	public IntermediateStop(Departure departure) {
		super();
		this.departure = departure;
	}

	public Departure getDeparture() {
		return departure;
	}

	public void setDeparture(Departure departure) {
		this.departure = departure;
	}
	

}
