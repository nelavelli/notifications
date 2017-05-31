package com.nelavelli.notifications.notification.dao.impl;

import org.springframework.stereotype.Repository;

import com.nelavelli.notifications.notification.dao.NotificationDAO;

@Repository
public class NotificationDAOImpl implements NotificationDAO {

	@Override
	public int getNotificationsCount(String lanId) {
		return 6;
	}

}
