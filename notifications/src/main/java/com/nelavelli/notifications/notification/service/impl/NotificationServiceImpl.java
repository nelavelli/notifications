package com.nelavelli.notifications.notification.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelavelli.notifications.notification.dao.NotificationDAO;
import com.nelavelli.notifications.notification.service.NotificationService;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	NotificationDAO notificationDAO ; 

	@Override
	public int getNotificationsCount(String lanId) {
		return notificationDAO.getNotificationsCount(lanId);
	}

}
