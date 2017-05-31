package com.nelavelli.notifications.alerts.dao.impl;

import java.util.Date;

import com.nelavelli.notifications.alerts.dao.AlertDAO;
import com.nelavelli.notifications.model.Alert;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
public class AlertDAOImpl implements AlertDAO {

	@Override
	public Alert getAlert(String lanId) {
		return new Alert("Scheduled Meeeting", "You will need to attend the meeting @ Raffels", new Date().toString(), "Raffels Place, Singapore");
	}

}
