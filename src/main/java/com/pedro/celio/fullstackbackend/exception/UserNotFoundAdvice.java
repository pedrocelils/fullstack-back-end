package com.pedro.celio.fullstackbackend.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler
	@ResponseStatus
	public Map<String, String> exceptionHandler(UserNotFoundException e){
		
		Map<String, String> erroMap=new HashMap<>();
		erroMap.put("errorMessage", e.getMessage());
		
		return erroMap;
	}
}
