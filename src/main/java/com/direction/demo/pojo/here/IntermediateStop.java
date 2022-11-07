package com.direction.demo.pojo.here;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
	@Override
	public String toString() {
		return "IntermediateStop [departure=" + departure + "]";
	}
	

}
