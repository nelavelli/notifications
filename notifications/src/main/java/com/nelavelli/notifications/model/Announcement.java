package com.nelavelli.notifications.model;

import java.io.Serializable;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
public class Announcement implements Serializable {

	private static final long serialVersionUID = -1403182613127173094L;

	private int announcementId;

	private String announcementDate;

	private String message;

	private String announcementType;

	private String priorty;

	private String targetUser;

	public int getAnnouncementId() {
		return announcementId;
	}

	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}

	public String getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAnnouncementType() {
		return announcementType;
	}

	public void setAnnouncementType(String announcementType) {
		this.announcementType = announcementType;
	}

	public String getPriorty() {
		return priorty;
	}

	public void setPriorty(String priorty) {
		this.priorty = priorty;
	}

	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

	@Override
	public String toString() {
		return "announcementId  : " + this.announcementId + "  :: announcementDate  : " + this.announcementDate + " :: announcementType  : "
				+ this.announcementType + " :: message : " + this.message + "  :: priorty : " + this.priorty + " :: targetUser : " + this.targetUser;
	}
}
