package com.nelavelli.notifications.alerts.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import com.nelavelli.notifications.alerts.dao.AlertDAO;
import com.nelavelli.notifications.alerts.service.AlertService;
import com.nelavelli.notifications.model.Alert;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
public class AlertServiceImpl implements AlertService {
	
	@Autowired
	AlertDAO alertDAO ;
	
	@Override
	public Alert getAlert(String lanId) {

		return alertDAO.getAlert(lanId);
	}

}
