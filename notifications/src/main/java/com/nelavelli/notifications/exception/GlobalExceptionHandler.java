package com.nelavelli.notifications.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nelavelli.notifications.model.Announcement;

/**
 * 
 * @author Nelavelli Naresh
 *
 */
@RestControllerAdvice(basePackages = {"com.nelavelli.notifications"})
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
    public Announcement handleNotFoundException(Exception ioe) {
        Announcement responseMsg = new Announcement();
        responseMsg.setMessage(ioe.getMessage());
        return responseMsg;
    }

}
