package com.nelavelli.notifications.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification implements Serializable {

	private static final long serialVersionUID = 8225174215807091027L;

	@JsonProperty
	private String notificationId;
	
	@JsonProperty
	private int notifCount;
	
	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public int getNotifCount() {
		return notifCount;
	}

	public void setNotifCount(int notifCount) {
		this.notifCount = notifCount;
	}

	
}
