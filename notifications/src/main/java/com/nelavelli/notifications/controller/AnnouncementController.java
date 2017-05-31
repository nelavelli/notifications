package com.nelavelli.notifications.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelavelli.notifications.model.Announcement;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
@RestController
@RequestMapping("/announcement")
public class AnnouncementController {

	@MessageMapping("/it")
	@SendTo("/topic/it")
	public Announcement publishItDepartment(Announcement announcement) throws Exception {
		Thread.sleep(1000); // simulated delay
		System.out.println("Message to IT Department :::::::: " + announcement.getMessage());
		return announcement;
	}

	@MessageMapping("/admin")
	@SendTo("/topic/admin")
	public Announcement publishAdminDepartment(Announcement announcement) throws Exception {
		Thread.sleep(1000); // simulated delay
		System.out.println("Message to ADMIN Department :::::::: " + announcement.getMessage());
		return announcement;
	}

	@MessageMapping("/hr")
	@SendTo("/topic/hr")
	public Announcement publishHrDepartment(Announcement announcement) throws Exception {
		Thread.sleep(1000); // simulated delay
		System.out.println("Message to HR Department  :::::::: " + announcement.getMessage());
		return announcement;
	}

	@MessageMapping("/sales")
	@SendTo("/topic/sales")
	public Announcement publishSalesDepartment(Announcement announcement) throws Exception {
		Thread.sleep(1000); // simulated delay
		System.out.println("Message to SALES Department  :::::::: " + announcement.getMessage());
		return announcement;
	}

	@MessageMapping("/all")
	@SendTo("/topic/all")
	public Announcement publishToAllDepartments(Announcement announcement) throws Exception {
		Thread.sleep(1000); // simulated delay
		System.out.println("Message to ALL the Departments  :::::::: " + announcement.getMessage());
		return announcement;
	}

}
