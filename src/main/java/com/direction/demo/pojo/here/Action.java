package com.direction.demo.pojo.here;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action {
	private String action;
	private int duration;
	private String instruction;
	private int length;
	private int offset;
	private String direction;
	private String severity;
	public Action() {
		
	}
	public Action(String action, int duration, String instruction, int length, int offset, String direction,
			String severity) {
		super();
		this.action = action;
		this.duration = duration;
		this.instruction = instruction;
		this.length = length;
		this.offset = offset;
		this.direction = direction;
		this.severity = severity;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	@Override
	public String toString() {
		return "Action [action=" + action + ", duration=" + duration + ", instruction=" + instruction + ", length="
				+ length + ", offset=" + offset + ", direction=" + direction + ", severity=" + severity + "]";
	}

}
