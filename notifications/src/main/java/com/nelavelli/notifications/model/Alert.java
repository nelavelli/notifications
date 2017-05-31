package com.nelavelli.notifications.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
public class Alert implements Serializable {

	private static final long serialVersionUID = 3102712322205242500L;

	public Alert() {
	}

	public Alert(String eventType, String eventMessage, String eventTime, String eventVenue) {
		this.eventType = eventType;
		this.eventMessage = eventMessage;
		this.eventTime = eventTime;
		this.eventVenue = eventVenue;
	}

	@JsonProperty
	private String eventType;

	@JsonProperty
	private String eventMessage;

	@JsonProperty
	private String eventTime;

	@JsonProperty
	private String eventVenue;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventMessage() {
		return eventMessage;
	}

	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventVenue() {
		return eventVenue;
	}

	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}

}
