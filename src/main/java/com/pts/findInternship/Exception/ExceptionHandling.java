package com.pts.findInternship.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {
	//Handler Not found Entity
	@ExceptionHandler(value = ResourceNotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponeMessage handlerNotFound(ResourceNotFound ex)
	{
		return new ResponeMessage(404, ex.getMessage());
	}
}
