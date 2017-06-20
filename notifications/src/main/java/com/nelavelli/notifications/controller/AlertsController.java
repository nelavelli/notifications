package com.nelavelli.notifications.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nelavelli.notifications.model.Notification;
import com.nelavelli.notifications.notification.service.NotificationService;

import reactor.core.publisher.Flux;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
@RestController
public class AlertsController {

	@Autowired
	NotificationService notificationService;

	@GetMapping(path = "/notifications", produces = MediaType.TEXT_HTML_VALUE)
	Resource index() {
		return new ClassPathResource("static/index.html");
	}

	@GetMapping(path = "/file")
	Resource resource(@RequestParam(value = "name", required = false) String name) {
		return new ClassPathResource("static/" + name);
	}

	@GetMapping(path="/events/{lanId}", produces = MediaType.ALL_VALUE)
	Flux<Notification> notifyEvents(@PathVariable String lanId) {
		try {
			System.out.println("person Object is triggred....     " + lanId);
			return Flux.interval(Duration.ofSeconds(1)).map(l -> {
				Notification notification = new Notification();
				notification.setNotificationId(String.valueOf(l));
				notification.setNotifCount(notificationService.getNotificationsCount(lanId));
				return notification;
			});

		} catch (Exception e) {
			return null;
		}
	}
}
